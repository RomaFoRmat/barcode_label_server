package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Conversion;
import bsw.iron.barcode_server.entity.DateTable;
import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.entity.MainValue;
import bsw.iron.barcode_server.entity.dto.MainGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.MainGroupResponseDTO;
import bsw.iron.barcode_server.entity.dto.MainValueDTO;
import bsw.iron.barcode_server.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MainGroupServiceImpl implements MainGroupService {

    private final MainGroupRepository mainGroupRepository;
    private final ConversionRepository conversionRepository;
    private final ForeignGroupRepository foreignGroupRepository;
    private final TestValueRepository testValueRepository;
    private final MainValueRepository mainValueRepository;
    private final DateTableRepository dateTableRepository;

    public MainGroupServiceImpl(MainGroupRepository mainGroupRepository, ConversionRepository conversionRepository, ForeignGroupRepository foreignGroupRepository, TestValueRepository testValueRepository, MainValueRepository mainValueRepository, DateTableRepository dateTableRepository) {
        this.mainGroupRepository = mainGroupRepository;
        this.conversionRepository = conversionRepository;
        this.foreignGroupRepository = foreignGroupRepository;
        this.testValueRepository = testValueRepository;
        this.mainValueRepository = mainValueRepository;
        this.dateTableRepository = dateTableRepository;
    }

    @Override
    public List<MainGroup> findAllByIdConversion() {
        return mainGroupRepository.findAllByIdConversion();
    }

    @Override
    @Transactional
    public MainGroupResponseDTO addIdMain(MainGroupRequestDTO mainGroupRequestDTO) {
        Conversion conversion = conversionRepository.findById(11690L)
                .orElseThrow(() -> new IllegalArgumentException("Conversion was not found"));

        MainGroup mainGroup = new MainGroup();
        mainGroup.setIdConversion(conversion);
        mainGroup.setDateCreate(LocalDateTime.now());
        MainGroup createdMainGroup = mainGroupRepository.saveAndFlush(mainGroup);

        DateTable dateTable = new DateTable();
        DateTable.DateTableForeignKey dateTableForeignKey = new DateTable.DateTableForeignKey();
        dateTableForeignKey.setMainGroup(createdMainGroup);
        dateTable.setDateTableForeignKey(dateTableForeignKey);
        dateTable.setWhoCreate(mainGroupRequestDTO.getWhoCreate());
        dateTable.setDateCreate(LocalDateTime.now());
        dateTable.setIpAddressCreate(mainGroupRequestDTO.getIpAddressCreate());
        dateTable.setLaboratory(mainGroupRequestDTO.getLaboratory());
        DateTable createdDateTable = dateTableRepository.saveAndFlush(dateTable);

        for (MainValueDTO mainValueDTO : mainGroupRequestDTO.getMainValueDTOList()) {
            MainValue mainValue = new MainValue();
            MainValue.MainValuePrimaryKey mainValuePrimaryKey = new MainValue.MainValuePrimaryKey();
            mainValuePrimaryKey.setIdHead(mainValueDTO.getIdHead());
            mainValuePrimaryKey.setIdGroup(createdMainGroup.getIdGroup());
            mainValue.setMainValuePrimaryKey(mainValuePrimaryKey);
            mainValue.setValue(mainValueDTO.getValue());
            mainValue.setNumberValue(mainValueDTO.getNumberValue());

            mainValueRepository.saveAndFlush(mainValue);
        }
        
        MainGroupResponseDTO mainGroupResponseDTO = new MainGroupResponseDTO();
        mainGroupResponseDTO.setMainGroup(createdMainGroup);
        mainGroupResponseDTO.setDateTable(createdDateTable);

        return mainGroupResponseDTO;
    }

    @Override
    public List<MainGroup> findByIdGroup(Long idGroup) {
        return mainGroupRepository.findByIdGroup(idGroup);
    }

    @Override
    public List<MainGroup> findAllByDateCreateWeek() { return  mainGroupRepository.findAllByDateCreateWeek(); }

    @Override
    public List<MainGroup> findAllByDateCreateMonth() {
        return mainGroupRepository.findAllByDateCreateMonth();
    }

    @Override
    public List<MainGroup> findAllByDateCreateSixMonth() {
        return mainGroupRepository.findAllByDateCreateSixMonth();
    }

    @Override
    public List<MainGroup> findAllByDateCreateYear() {
        return mainGroupRepository.findAllByDateCreateYear();
    }

    @Override
    public List<MainGroup> findAllByDateCreateBetween(LocalDateTime dateStart, LocalDateTime dateEnd) {
        return findAllByDateCreateBetween(dateStart,dateEnd);
    }
}

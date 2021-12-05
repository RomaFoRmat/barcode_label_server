package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.*;
import bsw.iron.barcode_server.entity.dto.ForeignGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.ForeignGroupResponseDTO;
import bsw.iron.barcode_server.entity.dto.TestValueDTO;
import bsw.iron.barcode_server.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class ForeignGroupServiceImpl implements ForeignGroupService {

    private final ForeignGroupRepository foreignGroupRepository;
    private final TestValueRepository testValueRepository;
    private final ConversionRepository conversionRepository;
    private final MainGroupRepository mainGroupRepository;
    private final DateTableRepository dateTableRepository;

    public ForeignGroupServiceImpl(ForeignGroupRepository foreignGroupRepository, TestValueRepository testValueRepository, ConversionRepository conversionRepository, MainGroupRepository mainGroupRepository, DateTableRepository dateTableRepository) {
        this.foreignGroupRepository = foreignGroupRepository;
        this.testValueRepository = testValueRepository;
        this.conversionRepository = conversionRepository;
        this.mainGroupRepository = mainGroupRepository;
        this.dateTableRepository = dateTableRepository;
    }


    @Override
    public List<ForeignGroup> findByMainGroupIdConversionAndIdForeignGroup(Long idForeignGroup) {
        return foreignGroupRepository.findByMainGroupIdConversionAndIdForeignGroup(idForeignGroup);
    }

    @Override
    @Transactional
    public ForeignGroupResponseDTO addIdForeign(ForeignGroupRequestDTO foreignGroupRequestDTO) {
        Conversion conversion = conversionRepository.findById(11690L)
                .orElseThrow(() -> new IllegalArgumentException("Conversion was not found"));

        ForeignGroup foreignGroup = new ForeignGroup();
        MainGroup mainGroup = mainGroupRepository.findById(foreignGroupRequestDTO.getTestValueDTOList().get(0).getMainGroup().getIdGroup())
                .orElseThrow(() -> new IllegalArgumentException("IdGroup was not found"));
        foreignGroup.setMainGroup(mainGroup);
        ForeignGroup createdForeignGroup = foreignGroupRepository.saveAndFlush(foreignGroup);

        DateTable dateTableForeign = new DateTable();
        DateTable.DateTableForeignKey dateTableForeignKey = new DateTable.DateTableForeignKey();
        dateTableForeignKey.setForeignGroup(createdForeignGroup);
        dateTableForeignKey.setMainGroup(mainGroup);
        dateTableForeign.setDateTableForeignKey(dateTableForeignKey);
        dateTableForeign.setWhoCreate(foreignGroupRequestDTO.getWhoCreate());
        dateTableForeign.setDateCreate(LocalDateTime.now());
        dateTableForeign.setIpAddressCreate(foreignGroupRequestDTO.getIpAddressCreate());
        dateTableForeign.setLaboratory(foreignGroupRequestDTO.getLaboratory());
        DateTable createdDateTableForeign = dateTableRepository.saveAndFlush(dateTableForeign);

        for (TestValueDTO testValueDTO : foreignGroupRequestDTO.getTestValueDTOList()) {
            TestValue testValue = new TestValue();
            TestValue.TestValuePrimaryKey testValuePrimaryKey = new TestValue.TestValuePrimaryKey();
            testValuePrimaryKey.setIdTestHead(testValueDTO.getIdTestHead());
            testValuePrimaryKey.setIdForeign(createdForeignGroup.getIdForeignGroup());
            testValue.setTestValuePrimaryKey(testValuePrimaryKey);
            testValue.setIdConversion(testValueDTO.getIdConversion());
            testValue.setTextValue(testValueDTO.getTextValue());
            testValue.setValue(testValueDTO.getValue());
            testValue.setDateValue(testValueDTO.getDateValue());

            testValueRepository.saveAndFlush(testValue);
        }
        ForeignGroupResponseDTO foreignGroupResponseDTO = new ForeignGroupResponseDTO();
        foreignGroupResponseDTO.setForeignGroup(createdForeignGroup);
        foreignGroupResponseDTO.setDateTable(createdDateTableForeign);

        return foreignGroupResponseDTO;
    }

    @Override
    public List<ForeignGroup> findAllByMainGroupIdConversionAndIdForeignGroup() {
        return foreignGroupRepository.findAllByMainGroupIdConversionAndIdForeignGroup();
    }


}

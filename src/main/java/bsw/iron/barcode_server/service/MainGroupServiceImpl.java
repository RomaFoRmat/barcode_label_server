package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Conversion;
import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.entity.TestValue;
import bsw.iron.barcode_server.repository.ConversionRepository;
import bsw.iron.barcode_server.repository.ForeignGroupRepository;
import bsw.iron.barcode_server.repository.MainGroupRepository;
import bsw.iron.barcode_server.repository.TestValueRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class MainGroupServiceImpl implements MainGroupService {

    private final MainGroupRepository mainGroupRepository;
    private final ConversionRepository conversionRepository;
    private final ForeignGroupRepository foreignGroupRepository;
    private final TestValueRepository testValueRepository;

    public MainGroupServiceImpl(MainGroupRepository mainGroupRepository, ConversionRepository conversionRepository, ForeignGroupRepository foreignGroupRepository, TestValueRepository testValueRepository) {
        this.mainGroupRepository = mainGroupRepository;
        this.conversionRepository = conversionRepository;
        this.foreignGroupRepository = foreignGroupRepository;
        this.testValueRepository = testValueRepository;
    }

    @Override
    public List<MainGroup> findAllByIdConversion() {
        return mainGroupRepository.findAllByIdConversion();
    }

    @Override
    @Transactional
    public MainGroup addIdMain(MainGroup mainGroup) {
        Conversion conversion  = conversionRepository.findById(11690)
                .orElseThrow(()-> new IllegalArgumentException("Conversion was not found"));
        mainGroup.setIdConversion(conversion);
        mainGroup.setDateCreate(LocalDate.now());
        MainGroup createdMainGroup = mainGroupRepository.saveAndFlush(mainGroup);

        ForeignGroup foreignGroup = new ForeignGroup();
        foreignGroup.setMainGroup(createdMainGroup);
//        return mainGroupRepository.saveAndFlush(mainGroup);
        foreignGroupRepository.saveAndFlush(foreignGroup);

        return createdMainGroup;
    }

    @Override
    public List<MainGroup> findByIdGroup(Long idGroup) {
        return mainGroupRepository.findByIdGroup(idGroup);
    }
}

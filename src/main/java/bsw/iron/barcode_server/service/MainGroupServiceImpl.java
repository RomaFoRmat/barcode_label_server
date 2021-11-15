package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.*;
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

    public MainGroupServiceImpl(MainGroupRepository mainGroupRepository, ConversionRepository conversionRepository, ForeignGroupRepository foreignGroupRepository, TestValueRepository testValueRepository, MainValueRepository mainValueRepository) {
        this.mainGroupRepository = mainGroupRepository;
        this.conversionRepository = conversionRepository;
        this.foreignGroupRepository = foreignGroupRepository;
        this.testValueRepository = testValueRepository;
        this.mainValueRepository = mainValueRepository;
    }

    @Override
    public List<MainGroup> findAllByIdConversion() {
        return mainGroupRepository.findAllByIdConversion();
    }

    @Override
    @Transactional
    public MainGroup addIdMain(MainGroup mainGroup) {
        Conversion conversion = conversionRepository.findById(11690L)
                .orElseThrow(() -> new IllegalArgumentException("Conversion was not found"));
        mainGroup.setIdConversion(conversion);
        mainGroup.setDateCreate(LocalDateTime.now());
        MainGroup createdMainGroup = mainGroupRepository.saveAndFlush(mainGroup);

        MainValue mainValue = new MainValue();
        MainValue.MainValuePrimaryKey mainValuePrimaryKey = new MainValue.MainValuePrimaryKey();
        mainValuePrimaryKey.setIdHead(11691L);
        mainValuePrimaryKey.setIdGroup(createdMainGroup.getIdGroup());
        mainValue.setMainValuePrimaryKey(mainValuePrimaryKey);
        mainValue.setValue("1267067"); //4612  -99017500/ BS-80/33 /3x0.20+6x0.35HT /  /ÍÊØ  ð
        mainValueRepository.saveAndFlush(mainValue);

        ForeignGroup foreignGroup = new ForeignGroup();
        foreignGroup.setMainGroup(createdMainGroup);
        foreignGroupRepository.saveAndFlush(foreignGroup);


        TestValue testValue = new TestValue();
        TestValue.TestValuePrimaryKey testValuePrimaryKey = new TestValue.TestValuePrimaryKey();
//        testValuePrimaryKey.setIdTestHead(11697L);
        testValuePrimaryKey.setIdForeign(foreignGroup.getIdForeignGroup());
        testValue.setTestValuePrimaryKey(testValuePrimaryKey);
//        testValue.setTextValue("TEST");
        testValue.setIdConversion(conversion.getIdConversion());
        testValueRepository.saveAndFlush(testValue);

        return createdMainGroup;
    }

    @Override
    public List<MainGroup> findByIdGroup(Long idGroup) {
        return mainGroupRepository.findByIdGroup(idGroup);
    }

    @Override
    public List<String> findAllByIdConversionOrderByDateCreateDateCreateDesc() {
        return mainGroupRepository.findAllByIdConversionOrderByDateCreateDateCreateDesc();
    }
}

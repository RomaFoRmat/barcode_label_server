package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Conversion;
import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.TestValue;
import bsw.iron.barcode_server.repository.ConversionRepository;
import bsw.iron.barcode_server.repository.ForeignGroupRepository;
import bsw.iron.barcode_server.repository.MainGroupRepository;
import bsw.iron.barcode_server.repository.TestValueRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ForeignGroupServiceImpl implements ForeignGroupService {

    private final ForeignGroupRepository foreignGroupRepository;
    private final TestValueRepository testValueRepository;
    private final ConversionRepository conversionRepository;
    private final MainGroupRepository mainGroupRepository;

    public ForeignGroupServiceImpl(ForeignGroupRepository foreignGroupRepository, TestValueRepository testValueRepository, ConversionRepository conversionRepository, MainGroupRepository mainGroupRepository) {
        this.foreignGroupRepository = foreignGroupRepository;
        this.testValueRepository = testValueRepository;
        this.conversionRepository = conversionRepository;
        this.mainGroupRepository = mainGroupRepository;
    }


    @Override
    public List<ForeignGroup> findByMainGroupIdConversionAndIdForeignGroup(Long idForeignGroup) {
        return foreignGroupRepository.findByMainGroupIdConversionAndIdForeignGroup(idForeignGroup);
    }

    @Override
    @Transactional
    public ForeignGroup addIdForeign(ForeignGroup foreignGroup) {
        Conversion conversion = conversionRepository.findById(11690)
                .orElseThrow(() -> new IllegalArgumentException("Conversion was not found"));
//        для проверки создания:

//        MainGroup mainGroup = mainGroupRepository.findById(1977541L)
//                .orElseThrow(()-> new IllegalArgumentException("IdGroup was not found"));
//        foreignGroup.setMainGroup(mainGroup)
        ForeignGroup createdForeignGroup = foreignGroupRepository.saveAndFlush(foreignGroup);

        TestValue testValue = new TestValue();
        TestValue.TestValuePrimaryKey testValuePrimaryKey = new TestValue.TestValuePrimaryKey();
//        testValuePrimaryKey.setIdTestHead(11697L);
        testValuePrimaryKey.setIdForeign(foreignGroup.getIdForeignGroup());
        testValue.setTestValuePrimaryKey(testValuePrimaryKey);
//        testValue.setTextValue("Test");
        testValue.setIdConversion(conversion.getIdConversion());
        testValueRepository.saveAndFlush(testValue);


        return createdForeignGroup;
    }

    @Override
    public List<ForeignGroup> findAllByMainGroupIdConversionAndIdForeignGroup() {
        return foreignGroupRepository.findAllByMainGroupIdConversionAndIdForeignGroup();
    }


}

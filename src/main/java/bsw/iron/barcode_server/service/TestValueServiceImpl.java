package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Conversion;
import bsw.iron.barcode_server.entity.TestValue;
import bsw.iron.barcode_server.repository.ConversionRepository;
import bsw.iron.barcode_server.repository.TestValueRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestValueServiceImpl implements TestValueService {

    private final TestValueRepository testValueRepository;
    private final ConversionRepository conversionRepository;

    public TestValueServiceImpl(TestValueRepository testValueRepository, ConversionRepository conversionRepository) {
        this.testValueRepository = testValueRepository;
        this.conversionRepository = conversionRepository;
    }

    @Override
    public List<TestValue> findByIdConversionAndIdTestHead(Long idTestHead) {
        return testValueRepository.findByIdConversionAndIdTestHead(idTestHead);
    }


    @Override
    public Page<TestValue> findAllByIdConversion(Pageable pageable) {
        return testValueRepository.findAllByIdConversion(pageable);
    }

    @Override
    public List<TestValue> findAllByIdConversion() {
        return testValueRepository.findAllByIdConversion();
    }

    @Override
    @Transactional
    public TestValue saveAndFlush(TestValue testValue) {
        Conversion conversion  = conversionRepository.findById(11690)
                .orElseThrow(()-> new IllegalArgumentException("not found"));
        return testValueRepository.saveAndFlush(testValue);
    }


}

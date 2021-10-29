package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestValue;
import bsw.iron.barcode_server.repository.TestValueRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestValueServiceImpl implements TestValueService {

    private final TestValueRepository testValueRepository;

    public TestValueServiceImpl(TestValueRepository testValueRepository) {
        this.testValueRepository = testValueRepository;
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


}

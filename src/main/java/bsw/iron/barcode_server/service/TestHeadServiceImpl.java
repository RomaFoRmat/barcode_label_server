package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestHead;
import bsw.iron.barcode_server.repository.TestHeadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestHeadServiceImpl implements TestHeadService {

    private final TestHeadRepository testHeadRepository;

    public TestHeadServiceImpl(TestHeadRepository testHeadRepository) {
        this.testHeadRepository = testHeadRepository;
    }

    @Override
    public List<TestHead> findAllByConversionIdConversion() {
        return testHeadRepository.findAllByConversionIdConversion();
    }
}

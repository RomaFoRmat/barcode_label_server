package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestLabel;
import bsw.iron.barcode_server.repository.TestLabelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestLabelServiceImpl implements TestLabelService{

    private final  TestLabelRepository testLabelRepository;

    public TestLabelServiceImpl(TestLabelRepository testLabelRepository) {
        this.testLabelRepository = testLabelRepository;
    }

    @Override
    public List<TestLabel> findByNumberSpool(String numberSpool) {
        return testLabelRepository.findByNumberSpool(numberSpool);
    }

    @Override
    public List<TestLabel> findAll() {
        return testLabelRepository.findAll();
    }

}

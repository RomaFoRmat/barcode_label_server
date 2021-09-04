package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestLabel;
import bsw.iron.barcode_server.repository.TestLabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TestLabelServiceImpl implements TestLabelService{

    private final  TestLabelRepository testLabelRepository;

    public TestLabelServiceImpl(TestLabelRepository testLabelRepository) {
        this.testLabelRepository = testLabelRepository;
    }

    @Override
    public List<TestLabel> findAllByNumbSpool(String numbSpool) {
        return testLabelRepository.findAllByNumbSpool(numbSpool);


    }

}

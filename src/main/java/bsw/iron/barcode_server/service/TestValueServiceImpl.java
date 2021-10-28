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
    public List<TestValue> findByIdPeredelAndIdTestHead(Long idTestHead) {
        return testValueRepository.findByIdPeredelAndIdTestHead(idTestHead);
    }


    @Override
    public Page<TestValue> findAllByIdPeredel(Pageable pageable) {
        return testValueRepository.findAllByIdPeredel(pageable);
    }

    @Override
    public List<TestValue> findAllByIdPeredel() {
        return testValueRepository.findAllByIdPeredel();
    }


}

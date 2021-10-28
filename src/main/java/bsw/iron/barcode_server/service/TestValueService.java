package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TestValueService {

    public List<TestValue> findByIdPeredelAndIdTestHead(Long idTestHead);

    public Page<TestValue> findAllByIdPeredel(Pageable pageable);


    public List<TestValue> findAllByIdPeredel();
}

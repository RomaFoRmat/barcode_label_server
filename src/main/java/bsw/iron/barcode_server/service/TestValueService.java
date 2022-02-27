package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TestValueService {

    List<TestValue> findByIdConversionAndIdTestHead(Long idTestHead);
    Page<TestValue> findAllByIdConversion(Pageable pageable);
    List<TestValue> findAllByIdConversion();
    TestValue saveAndFlush(TestValue testValue);

}

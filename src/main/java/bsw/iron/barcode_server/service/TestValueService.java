package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestLabel;
import bsw.iron.barcode_server.entity.TestValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface TestValueService {

    public List<TestValue> findByIdConversionAndIdTestHead(Long idTestHead);

    public Page<TestValue> findAllByIdConversion(Pageable pageable);


    public List<TestValue> findAllByIdConversion();

    public TestValue saveAndFlush(TestValue testValue);

}

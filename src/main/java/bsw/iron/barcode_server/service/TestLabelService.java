package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestLabel;

import java.time.LocalDateTime;
import java.util.List;


public interface TestLabelService {

    List<TestLabel> findByNumberSpool(String numberSpool);
    List<TestLabel> findAll();
    List<TestLabel> findAllByDateCreate();
    List<TestLabel> findAllByDateCreateBetween(LocalDateTime dateCreateStart, LocalDateTime dateCreateEnd);
    List<TestLabel> findFirstValuesByRowNum(String rowNum);

}

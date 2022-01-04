package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestLabel;

import java.time.LocalDateTime;
import java.util.List;


public interface TestLabelService {

    public List<TestLabel> findByNumberSpool(String numberSpool);
    public List<TestLabel> findAll();
    public List<TestLabel> findAllByDateCreate();
    public List<TestLabel> findAllByDateCreateBetween(LocalDateTime dateCreateStart, LocalDateTime dateCreateEnd);

}

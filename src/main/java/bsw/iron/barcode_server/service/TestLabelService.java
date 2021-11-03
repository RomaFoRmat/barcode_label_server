package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestLabel;

import java.util.List;


public interface TestLabelService {

    public List<TestLabel> findByNumberSpool(String numberSpool);

    public List<TestLabel> findAll();

}

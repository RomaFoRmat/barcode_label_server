package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestLabel;

import java.util.List;


public interface TestLabelService {
    //    public List<TestLabel> getAllTestLabel();
//    public TestLabel getTestLabel(Long id_group);
    public List<TestLabel> findByNumberSpool(String numberSpool);
}

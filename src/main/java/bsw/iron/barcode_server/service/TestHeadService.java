package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TestHead;

import java.util.List;

public interface TestHeadService {
    public List<TestHead> findAllByConversionIdConversion();
}

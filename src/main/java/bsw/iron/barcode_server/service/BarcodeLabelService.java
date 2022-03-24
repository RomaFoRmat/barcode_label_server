package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.BarcodeLabel;

import java.util.List;

public interface BarcodeLabelService {

    List<BarcodeLabel> findByNumberSpool(String numberSpool);
    List<BarcodeLabel> findByNumberSpoolBetween(Integer amountDays,String numberSpool);
}

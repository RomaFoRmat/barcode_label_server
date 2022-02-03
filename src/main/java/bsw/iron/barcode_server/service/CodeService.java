package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Code;

import java.util.List;

public interface CodeService {

    List<Code> findAllByConversionIdConversion();
    List<Code> findByCode(String code);
    Code findByIdKod(Long code);
}

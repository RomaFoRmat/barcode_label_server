package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Code;

import java.util.List;

public interface CodeService {

    public List<Code> findAllByConversionIdConversion();
    public List<Code> findByCode(String code);
    public Code findByIdKod(Long code);
}

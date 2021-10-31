package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainValue;
import bsw.iron.barcode_server.entity.TestValue;

import java.util.List;

public interface MainValueService {

    public List<MainValue> findByMainValuePrimaryKeyIdHead(Long idHead);

    public List<MainValue> findAll();
}

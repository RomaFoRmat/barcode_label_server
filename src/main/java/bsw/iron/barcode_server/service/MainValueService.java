package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainValue;
import bsw.iron.barcode_server.entity.TestValue;

import java.util.List;

public interface MainValueService {

    public List<MainValue> findByHeadMainConversionIdConversionAndHeadMainIdHead(Long idHead);

    public List<MainValue> findAllByHeadMain_Conversion_IdConversion();
}

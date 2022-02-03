package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MainValueService {

    List<MainValue> findByMainValuePrimaryKeyIdHead(Long idHead);
    List<String> findFirstByMainValuePrimaryKeyIdHead();
    List<MainValue> findAll();
    Page<MainValue> findAll(Pageable pageable);
    MainValue saveAndFlush(MainValue mainValue);
}

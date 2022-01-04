package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MainValueService {

    public List<MainValue> findByMainValuePrimaryKeyIdHead(Long idHead);

    public List<String> findFirstByMainValuePrimaryKeyIdHead();

    public List<MainValue> findAll();

    public Page<MainValue> findAll(Pageable pageable);

    public MainValue saveAndFlush(MainValue mainValue);
}

package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TableSpools;

import java.time.LocalDateTime;
import java.util.List;


public interface TableSpoolsService {

    List<TableSpools> findByNumberSpool(String numberSpool);
    List<TableSpools> findAll();
    List<TableSpools> findAllByDateCreate();
    List<TableSpools> findAllByDateCreateBetween(LocalDateTime dateCreateStart, LocalDateTime dateCreateEnd);
    List<TableSpools> findFirstValuesByRowNum(String rowNum);

}

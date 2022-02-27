package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TableSpools;
import bsw.iron.barcode_server.repository.TableSpoolsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class TableSpoolsServiceImpl implements TableSpoolsService {

    private final TableSpoolsRepository tableSpoolsRepository;

    public TableSpoolsServiceImpl(TableSpoolsRepository tableSpoolsRepository) {
        this.tableSpoolsRepository = tableSpoolsRepository;
    }

    @Override
    public List<TableSpools> findByNumberSpool(String numberSpool) {
        System.out.println(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + " Request started");
        List<TableSpools> list = tableSpoolsRepository.findByNumberSpool(numberSpool);
        System.out.println(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + " Request ended");
        return list;
    }

    @Override
    public List<TableSpools> findAll() {
        return tableSpoolsRepository.findAll();
    }

    @Override
    public List<TableSpools> findAllByDateCreate() {
        return tableSpoolsRepository.findAllByDateCreate();
    }

    @Override
    public List<TableSpools> findAllByDateCreateBetween(LocalDateTime dateCreateStart, LocalDateTime dateCreateEnd) {
        return tableSpoolsRepository.findAllByDateCreateBetween(dateCreateStart,dateCreateEnd);
    }

    @Override
    public List<TableSpools> findFirstValuesByRowNum(String rowNum) {
        return tableSpoolsRepository.findFirstValuesByRowNum(rowNum);
    }

}

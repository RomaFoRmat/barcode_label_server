package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.TableSpools;
import bsw.iron.barcode_server.service.TableSpoolsService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class TableSpoolsController {

    private final TableSpoolsService tableSpoolsService;
    public TableSpoolsController(TableSpoolsService tableSpoolsService) {
        this.tableSpoolsService = tableSpoolsService;
    }

    @GetMapping("/label/spool/{numberSpool}")
    public List<TableSpools> showDataNumbSpool(@PathVariable String numberSpool) {
        return tableSpoolsService.findByNumberSpool(numberSpool);
    }

    @GetMapping("/label/spool")
    public List<TableSpools> getAllSpools() {
        return tableSpoolsService.findAll();
    }

    @GetMapping("/allSpool/forTheLastDay")
    public List<TableSpools> getAllSpoolsForTheLastDay(){
        return tableSpoolsService.findAllByDateCreate();
    }

    @GetMapping("/allSpool/{dateCreateStart}/{dateCreateEnd}")
    public List<TableSpools> findAllByDateCreateBetween(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateCreateStart,
                                                        @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateCreateEnd) {
        return tableSpoolsService.findAllByDateCreateBetween(dateCreateStart, dateCreateEnd);
    }

    @GetMapping("/allSpool/{rowNum}")
    public List<TableSpools> findFirstValuesByRowNum(@PathVariable String rowNum){
        return tableSpoolsService.findFirstValuesByRowNum(rowNum);
    }


}

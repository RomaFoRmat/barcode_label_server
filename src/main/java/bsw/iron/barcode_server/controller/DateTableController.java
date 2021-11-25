package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.DateTable;
import bsw.iron.barcode_server.service.DateTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DateTableController {

    private final DateTableService dateTableService;

    public DateTableController(DateTableService dateTableService) {
        this.dateTableService = dateTableService;
    }

    @GetMapping("/dateTable")
    public DateTable saveAndFlash(@RequestBody DateTable dateTable) {
        return dateTableService.saveAndFlush(dateTable);
    }
}

package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.BarcodeLabel;
import bsw.iron.barcode_server.service.BarcodeLabelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class BarcodeLabelController {
    private final BarcodeLabelService barcodeLabelService;

    public BarcodeLabelController(BarcodeLabelService barcodeLabelService) {
        this.barcodeLabelService = barcodeLabelService;
    }
    @GetMapping("/spool/{numberSpool}")
    public List<BarcodeLabel> showDataSpool(@PathVariable String numberSpool) {
        return barcodeLabelService.findByNumberSpool(numberSpool);
    }
    @GetMapping("/spool-between/{amountDays}/{numberSpool}")
    public List<BarcodeLabel> showDataSpoolBetween(@PathVariable Integer amountDays,
                                                   @PathVariable String numberSpool) {
        return barcodeLabelService.findByNumberSpoolBetween(amountDays,numberSpool);
    }
}

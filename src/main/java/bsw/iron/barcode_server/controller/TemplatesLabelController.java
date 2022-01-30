package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.TemplatesLabels;
import bsw.iron.barcode_server.service.TemplatesLabelsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates/")
public class TemplatesLabelController {
    private final TemplatesLabelsService templatesLabelsService;

    public TemplatesLabelController(TemplatesLabelsService templatesLabelsService) {
        this.templatesLabelsService = templatesLabelsService;
    }

    @GetMapping("/{idCode}")
    public List<TemplatesLabels> findByIdCode(@PathVariable Long idCode) {
        return templatesLabelsService.findByIdCode(idCode);
    }

    @GetMapping("/all")
    public List<TemplatesLabels> findAll() {
        return templatesLabelsService.findAll();
    }

    @PostMapping("/create")
    public TemplatesLabels saveAndFlash(@RequestBody TemplatesLabels templatesLabels) {
        return templatesLabelsService.saveAndFlush(templatesLabels);
    }
}

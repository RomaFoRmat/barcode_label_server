package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.MainValue;
import bsw.iron.barcode_server.service.MainValueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class MainValueController {

    private final MainValueService mainValueService;

    public MainValueController(MainValueService mainValueService) {
        this.mainValueService = mainValueService;
    }

    @GetMapping("/getAllMainValuesByIdConversion11690/{idHead}")
    public List<MainValue> findByMainValuePrimaryKeyIdHead(@PathVariable Long idHead){
        return mainValueService.findByMainValuePrimaryKeyIdHead(idHead);
    }

    @GetMapping("/getAllMainValuesByIdConversion11690")
    public List<MainValue> findAll(){
        return mainValueService.findAll();
    }
}

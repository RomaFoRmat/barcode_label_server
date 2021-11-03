package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.service.CodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CodeController {

    private final CodeService codeService;

    public CodeController(CodeService codeService) {
        this.codeService = codeService;
    }

    @GetMapping("/getAllCodes")
    public List<String> findAllByConversionIdConversion() {
        return codeService.findAllByConversionIdConversion();
    }
}

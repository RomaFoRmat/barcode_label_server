package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.Code;
import bsw.iron.barcode_server.entity.TestLabel;
import bsw.iron.barcode_server.service.CodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public List<Code> findAllByConversionIdConversion() {
        return codeService.findAllByConversionIdConversion();
    }
    @GetMapping("/code/{code}")
    public List<Code> findByCode(@PathVariable String code) {
        return codeService.findByCode(code);
    }

    @GetMapping("/codeDTO/{code}")
    public Code findByIdCode(@PathVariable Long code){
        return codeService.findByIdCode(code);
    }
    
}

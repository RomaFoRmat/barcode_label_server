package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.TestValue;
import bsw.iron.barcode_server.service.TestValueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ControllerTestValue {

    private final TestValueService testValueService;

    public ControllerTestValue(TestValueService testValueService) {
        this.testValueService = testValueService;
    }

    @GetMapping("/label/spool/testvalue")
    public List<TestValue> findTestValuesByIdTestHeadAndIdPeredel() {
        return testValueService.findTestValuesByIdTestHeadAndIdPeredel();
    }


}

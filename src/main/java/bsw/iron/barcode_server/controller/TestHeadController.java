package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.TestHead;
import bsw.iron.barcode_server.service.TestHeadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class TestHeadController {

    private final TestHeadService testHeadService;

    public TestHeadController(TestHeadService testHeadService) {
        this.testHeadService = testHeadService;
    }

    @GetMapping("/getAllTestHead")
    public List<TestHead> findAllByConversionIdConversion() {
        return testHeadService.findAllByConversionIdConversion();
    }
}

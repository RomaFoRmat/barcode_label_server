package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.TestLabel;
import bsw.iron.barcode_server.service.TestLabelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class TestLabelController {

    private final TestLabelService testLabelService;

    public TestLabelController(TestLabelService testLabelService) {
        this.testLabelService = testLabelService;
    }


    @GetMapping("/label/spool/{numberSpool}")
    public List<TestLabel> showDataNumbSpool(@PathVariable String numberSpool) {
        return testLabelService.findByNumberSpool(numberSpool);
    }

    @GetMapping("/label/spool")
    public List<TestLabel> getAllSpools() {
        return testLabelService.findAll();
    }

    @GetMapping("/allSpool/forTheLastDay")
    public List<TestLabel> getAllSpoolsForTheLastDay(){
        return testLabelService.findAllByDateCreate();
    }

}

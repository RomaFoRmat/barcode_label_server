package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.TestLabel;
import bsw.iron.barcode_server.service.TestLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ControllerTestLabel {

    private final TestLabelService testLabelService;

    public ControllerTestLabel(TestLabelService testLabelService) {
        this.testLabelService = testLabelService;
    }


    @GetMapping("/label/spool/{numbSpool}")
    public List<TestLabel> showDataNumbSpool(@PathVariable String numbSpool) {
        return testLabelService.findByNumbSpool(numbSpool);
    }

}

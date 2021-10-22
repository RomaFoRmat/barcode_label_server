package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.TestValue;
import bsw.iron.barcode_server.service.TestValueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class ControllerTestValue {

    private final TestValueService testValueService;

    public ControllerTestValue(TestValueService testValueService) {
        this.testValueService = testValueService;
    }

    @GetMapping("/label/spool/testvalue11697")
    public List<TestValue> findAllByIdPeredelAndIdTestHead() {
        return testValueService.findAllByIdPeredelAndIdTestHead();
    }


    @GetMapping("/label/spool/testvalues")
    public Page<TestValue> findAllByIdPeredel(
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<String> sortBy) {
        return testValueService.findAllByIdPeredel(
                PageRequest.of(page.orElse(0),
                        5,
                        Sort.Direction.DESC, sortBy.orElse("foreignGroup")));
    }


}


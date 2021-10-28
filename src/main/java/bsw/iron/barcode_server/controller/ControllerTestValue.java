package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.TestValue;
import bsw.iron.barcode_server.service.TestValueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class ControllerTestValue {

    private final TestValueService testValueService;

    public ControllerTestValue(TestValueService testValueService) {
        this.testValueService = testValueService;
    }

    @GetMapping("/findAllValues/for11690/{idTestHead}")
    public List<TestValue> findByIdPeredelAndIdTestHead(@PathVariable Long idTestHead) {
        return testValueService.findByIdPeredelAndIdTestHead(idTestHead);
    }


    @GetMapping("/findAllValues/for11690")
    public Page<TestValue> findAllByIdPeredel(
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<String> sortBy) {
        return testValueService.findAllByIdPeredel(
                PageRequest.of(page.orElse(0),
                        10,
                        Sort.Direction.DESC, sortBy.orElse("idForeign")));
    }

    @GetMapping("/allvalues")
    public List<TestValue> findAllByIdPeredel() {
        return testValueService.findAllByIdPeredel();
    }

}


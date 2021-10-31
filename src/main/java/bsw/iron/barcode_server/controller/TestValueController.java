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
public class TestValueController {

    private final TestValueService testValueService;

    public TestValueController(TestValueService testValueService) {
        this.testValueService = testValueService;
    }

    @GetMapping("/allTestValuesByIdConversion11690/{idTestHead}")
    public List<TestValue> findByIdConversionAndIdTestHead(@PathVariable Long idTestHead) {
        return testValueService.findByIdConversionAndIdTestHead(idTestHead);
    }


    @GetMapping("/getAllTestValuesByIdConversion11690")
    public Page<TestValue> findAllByIdConversion(
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<String> sortBy) {
        return testValueService.findAllByIdConversion(
                PageRequest.of(page.orElse(0),
                        10,
                        Sort.Direction.DESC, sortBy.orElse("idForeign")));
    }

    @GetMapping("/allTestValuesByIdConversion11690")
    public List<TestValue> findAllByIdConversion() {
        return testValueService.findAllByIdConversion();
    }

    @PostMapping("/createTestValues")
    public TestValue saveAndFlush(@RequestBody TestValue testValue){
        return testValueService.saveAndFlush(testValue);
    }
}


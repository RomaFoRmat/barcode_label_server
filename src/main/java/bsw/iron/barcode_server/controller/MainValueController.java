package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.MainValue;
import bsw.iron.barcode_server.service.MainValueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class MainValueController {

    private final MainValueService mainValueService;

    public MainValueController(MainValueService mainValueService) {
        this.mainValueService = mainValueService;
    }

    @GetMapping("/allMainValues/{idHead}")
    public List<MainValue> findByMainValuePrimaryKeyIdHead(@PathVariable Long idHead) {
        return mainValueService.findByMainValuePrimaryKeyIdHead(idHead);
    }

    @GetMapping("/lastProtocol")
    public List<String> findFirstByMainValuePrimaryKeyIdHead() {
        return mainValueService.findFirstByMainValuePrimaryKeyIdHead();
    }

    @GetMapping("/allMainValues")
    public List<MainValue> findAll() {
        return mainValueService.findAll();
    }

    @GetMapping("/pageMainValues")
    public Page<MainValue> findALL(
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<String> sortBy) {
        return mainValueService.findAll(
                PageRequest.of(page.orElse(0), 30,
                        Sort.Direction.DESC, sortBy.orElse("mainValuePrimaryKey")));
    }

    @PostMapping("/createMainValues")
    public MainValue saveAndFlash(@RequestBody MainValue mainValue) {
        return mainValueService.saveAndFlush(mainValue);
    }
}

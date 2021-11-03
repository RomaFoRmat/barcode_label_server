package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.service.MainGroupService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class MainGroupController {

    private final MainGroupService mainGroupService;

    public MainGroupController(MainGroupService mainGroupService) {
        this.mainGroupService = mainGroupService;
    }

    @GetMapping("/getAllByConversion11690/idMainGroup")
    public List<MainGroup> findAllByIdConversion() {
        return mainGroupService.findAllByIdConversion();
    }


    @PostMapping("/addIdGroup")
    @ResponseStatus(code = HttpStatus.CREATED)
    public MainGroup addIdMain(@RequestBody MainGroup mainGroup) {
        return mainGroupService.addIdMain(mainGroup);
    }


    @GetMapping("/getIdGroupByConversion11690/{idGroup}")
    public List<MainGroup> findByIdGroup(@PathVariable Long idGroup) {
        return mainGroupService.findByIdGroup(idGroup);
    }

    @GetMapping("/getAllIdGroup")
    public List<String> getAllIdGroup() {
        return mainGroupService.findAllByIdConversionOrderByDateCreateDateCreateDesc();
    }
}

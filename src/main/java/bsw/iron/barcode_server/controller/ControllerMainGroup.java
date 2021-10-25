package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.service.MainGroupService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ControllerMainGroup {

    private final MainGroupService mainGroupService;

    public ControllerMainGroup(MainGroupService mainGroupService) {
        this.mainGroupService = mainGroupService;
    }

    @GetMapping("/label/table/idMainGroup")
    public List<MainGroup> findAllByIdPeredel() {
        return mainGroupService.findAllByIdPeredel();
    }


    @PostMapping("/addIdGroup")
    @ResponseStatus(code = HttpStatus.CREATED)
    public MainGroup addIdMain(@RequestBody MainGroup mainGroup) {
        return mainGroupService.addIdMain(mainGroup);
    }

    @GetMapping("/idGroup/{idGroup}")
    public List<MainGroup> showMainGroupsByIdGroup(@PathVariable Long idGroup) {
        return mainGroupService.findByIdGroup(idGroup);
    }
}

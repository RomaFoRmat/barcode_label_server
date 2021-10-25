package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.service.ForeignGroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ControllerForeignGroup {

    private final ForeignGroupService foreignGroupService;

    public ControllerForeignGroup(ForeignGroupService foreignGroupService) {
        this.foreignGroupService = foreignGroupService;
    }

    @GetMapping("/label/table/idForeignGroup")
    public List<ForeignGroup> findAllByMainGroup() {
        return foreignGroupService.findAllByMainGroup();
    }
}

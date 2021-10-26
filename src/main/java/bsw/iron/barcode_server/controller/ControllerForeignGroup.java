package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.service.ForeignGroupService;
import bsw.iron.barcode_server.service.MainGroupService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/findByMainGroup/{mainGroup}")
    public List<ForeignGroup> findByMainGroup(@PathVariable MainGroup mainGroup){
        return  foreignGroupService.findByMainGroup(mainGroup);
    }

//    @PostMapping("/create/foreignGroup/{idGroup}")
//    public ForeignGroup saveAndFlush( @RequestBody ForeignGroup foreignGroup,
//                                      @PathVariable Long idGroup) {
//        return foreignGroupService.saveAndFlush(foreignGroup,idGroup);
//    }
    @PostMapping("/create/foreignGroup")
    public ForeignGroup saveAndFlush( @RequestBody ForeignGroup foreignGroup) {
        return foreignGroupService.saveAndFlush(foreignGroup);
    }
}

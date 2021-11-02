package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.service.ForeignGroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ForeignGroupController {

    private final ForeignGroupService foreignGroupService;

    public ForeignGroupController(ForeignGroupService foreignGroupService) {
        this.foreignGroupService = foreignGroupService;
    }


    @GetMapping("/getByIdForeignGroup/{idForeignGroup}")
    public List<ForeignGroup> findByMainGroupIdConversionAndIdForeignGroup (@PathVariable Long idForeignGroup){
        return  foreignGroupService.findByMainGroupIdConversionAndIdForeignGroup(idForeignGroup);
    }

    @PostMapping("/create/foreignGroup")
    public ForeignGroup addIdForeign(@RequestBody ForeignGroup foreignGroup) {
        return foreignGroupService.addIdForeign(foreignGroup);
    }

    @GetMapping("/getAllByIdForeignGroup")
    public List<ForeignGroup> findAllByMainGroupIdConversionAndIdForeignGroup(){
        return foreignGroupService.findAllByMainGroupIdConversionAndIdForeignGroup();
    }
}

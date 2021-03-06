package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.dto.ForeignGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.ForeignGroupResponseDTO;
import bsw.iron.barcode_server.service.ForeignGroupService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.transaction.annotation.Transactional;
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
    @Transactional
    public ForeignGroupResponseDTO addIdForeign(@RequestBody String testValue) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        ForeignGroupRequestDTO value = mapper.readValue(testValue, new TypeReference<ForeignGroupRequestDTO>() {
        });
        return foreignGroupService.addIdForeign(value);
//        return foreignGroupService.addIdForeign(value).getIdForeignGroup();
    }

//    @PostMapping("/create/foreignGroup")
//    public ForeignGroup addIdForeign(@RequestBody ForeignGroup foreignGroup) {
//        return foreignGroupService.addIdForeign(foreignGroup);
//    }

    @GetMapping("/getAllByIdForeignGroup")
    public List<ForeignGroup> findAllByMainGroupIdConversionAndIdForeignGroup() {
        return foreignGroupService.findAllByMainGroupIdConversionAndIdForeignGroup();
    }

    @GetMapping("/amount-spools/{idGroup}")
    public Integer findByMainGroupAmount(@PathVariable Long idGroup) {
        return foreignGroupService.findByMainGroupAmount(idGroup);
    }
}

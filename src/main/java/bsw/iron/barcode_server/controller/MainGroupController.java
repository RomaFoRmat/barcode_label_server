package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.entity.dto.MainGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.MainGroupResponseDTO;
import bsw.iron.barcode_server.service.MainGroupService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
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
    public MainGroupResponseDTO addIdMain(@RequestBody String mainValue) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        MainGroupRequestDTO value = mapper.readValue(mainValue, new TypeReference<MainGroupRequestDTO>() {
        });
        return mainGroupService.addIdMain(value);
    }


    @GetMapping("/getIdGroupByConversion11690/{idGroup}")
    public List<MainGroup> findByIdGroup(@PathVariable Long idGroup) {
        return mainGroupService.findByIdGroup(idGroup);
    }

    @GetMapping("/getAllIdGroup")
    public List<MainGroup> getAllIdGroup() {
        return mainGroupService.findAllByIdConversionOrderByDateCreateDateCreateDesc();
    }
}

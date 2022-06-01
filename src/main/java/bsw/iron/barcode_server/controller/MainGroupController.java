package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.entity.dto.MainGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.MainGroupResponseDTO;
import bsw.iron.barcode_server.service.MainGroupService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

    @GetMapping("/getAllIdGroup-forTheWeek")
    public List<MainGroup> getAllIdGroupWeek() {
        return mainGroupService.findAllByDateCreateWeek();
    }

    @GetMapping("/getAllIdGroup-forTheMonth")
    public List<MainGroup> getAllIdGroupMonth() {
        return mainGroupService.findAllByDateCreateMonth();
    }

    @GetMapping("/getAllIdGroup-forTheYear")
    public List<MainGroup> getAllIdGroupForTheYear() {
        return mainGroupService.findAllByDateCreateYear();
    }

    @GetMapping("/getAllIdGroup-forSixMonths")
        public List<MainGroup> getAllIdGroupSixMonths(){
        return mainGroupService.findAllByDateCreateSixMonth();
    }

    @GetMapping("/getAllIdGroupBetween/{dateStart}{dateEnd}")
    public List<MainGroup> findAllByDateCreateBetween(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateStart,
                                                      @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateEnd){
        return mainGroupService.findAllByDateCreateBetween(dateStart,dateEnd);
    }
}

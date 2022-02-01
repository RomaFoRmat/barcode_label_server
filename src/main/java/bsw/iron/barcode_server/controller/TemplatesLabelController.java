package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.TemplatesLabels;
import bsw.iron.barcode_server.entity.dto.ForeignGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.ForeignGroupResponseDTO;
import bsw.iron.barcode_server.entity.dto.TemplateLabelDTO;
import bsw.iron.barcode_server.service.TemplatesLabelsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates/")
public class TemplatesLabelController {
    private final TemplatesLabelsService templatesLabelsService;

    public TemplatesLabelController(TemplatesLabelsService templatesLabelsService) {
        this.templatesLabelsService = templatesLabelsService;
    }

    @GetMapping("/{idCode}")
    public List<TemplatesLabels> findByIdCode(@PathVariable Long idCode) {
        return templatesLabelsService.findByIdCode(idCode);
    }

    @GetMapping("/all")
    public List<TemplateLabelDTO> findAllOrderByIdCode() {
        return templatesLabelsService.findAllOrderByIdCode();
    }

    @PostMapping("/create")
//    public TemplatesLabels saveAndFlash(@RequestBody TemplatesLabels templatesLabels) {
//        return templatesLabelsService.saveAndFlush(templatesLabels);
//    }
    @Transactional
    public TemplatesLabels addIdForeign(@RequestBody String templatesLabels) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        TemplatesLabels template = mapper.readValue(templatesLabels, new TypeReference<TemplatesLabels>() {
        });
        return templatesLabelsService.saveAndFlush(template);
    }

    @DeleteMapping("/{idTemplate}")
    @Transactional
    public void deleteByIdTemplate(@PathVariable Long idTemplate) {
        templatesLabelsService.deleteByIdTemplate(idTemplate);
    }
}


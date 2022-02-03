package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TemplatesLabels;
import bsw.iron.barcode_server.entity.dto.TemplateLabelDTO;

import java.util.List;

public interface TemplatesLabelsService {
    List<TemplatesLabels> findByIdCode(Long idCode);
    TemplatesLabels saveAndFlush(TemplatesLabels templatesLabels);
//    public TemplatesLabels addTemplate(TemplateLabelDTO templatesLabelDTO);
    List<TemplateLabelDTO> findAllOrderByIdCode();
    List<TemplatesLabels> findByIdTemplate(Long idTemplate);
    void deleteByIdTemplate(Long idTemplate);
}

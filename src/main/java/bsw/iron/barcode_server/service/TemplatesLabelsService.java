package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TemplatesLabels;
import bsw.iron.barcode_server.entity.dto.TemplateLabelDTO;

import java.util.List;

public interface TemplatesLabelsService {
    public List<TemplatesLabels> findByIdCode(Long idCode);
    public TemplatesLabels saveAndFlush(TemplatesLabels templatesLabels);
//    public TemplatesLabels addTemplate(TemplateLabelDTO templatesLabelDTO);
    public List<TemplatesLabels> findAllOrderByIdCode();
}

package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TemplatesLabels;

import java.util.List;

public interface TemplatesLabelsService {
    public List<TemplatesLabels> findByIdCode(Long idCode);
    public TemplatesLabels saveAndFlush(TemplatesLabels templatesLabels);
    public List<TemplatesLabels> findAll();
}

package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.TemplatesLabels;
import bsw.iron.barcode_server.repository.TemplatesLabelsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplatesLabelsServiceImpl implements TemplatesLabelsService {

    private final TemplatesLabelsRepository templatesLabelsRepository;

    public TemplatesLabelsServiceImpl(TemplatesLabelsRepository templatesLabelsRepository) {
        this.templatesLabelsRepository = templatesLabelsRepository;
    }

    @Override
    public List<TemplatesLabels> findByIdCode(Long idCode) {
        return templatesLabelsRepository.findByIdCode(idCode);
    }

    @Override
    public TemplatesLabels saveAndFlush(TemplatesLabels templatesLabels) {
        return templatesLabelsRepository.saveAndFlush(templatesLabels);
    }

    @Override
    public List<TemplatesLabels> findAll() {
        return templatesLabelsRepository.findAll();
    }
}

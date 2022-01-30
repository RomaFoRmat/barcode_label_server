package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Code;
import bsw.iron.barcode_server.entity.TemplatesLabels;
import bsw.iron.barcode_server.entity.dto.TemplateLabelDTO;
import bsw.iron.barcode_server.repository.CodeRepository;
import bsw.iron.barcode_server.repository.TemplatesLabelsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TemplatesLabelsServiceImpl implements TemplatesLabelsService {

    private final TemplatesLabelsRepository templatesLabelsRepository;
    private final CodeRepository codeRepository;

    public TemplatesLabelsServiceImpl(TemplatesLabelsRepository templatesLabelsRepository, CodeRepository codeRepository) {
        this.templatesLabelsRepository = templatesLabelsRepository;
        this.codeRepository = codeRepository;
    }

    @Override
    public List<TemplatesLabels> findByIdCode(Long idCode) {
        return templatesLabelsRepository.findByIdCode(idCode);
    }

//    @Override
//    @Transactional
//    public TemplatesLabels addTemplate(TemplateLabelDTO templatesLabelDTO) {
//        TemplatesLabels templatesLabels = new TemplatesLabels();
//        Long id = templatesLabels.getIdCode();
//
//
//        Code code = new Code();
//        Code.CodePrimaryKey codePrimaryKey = new Code.CodePrimaryKey();
//        codePrimaryKey.setIdCode(id);
//        code.setCode();
//
//        return null;
//    }

    @Override
    public TemplatesLabels saveAndFlush(TemplatesLabels templatesLabels) {
        return templatesLabelsRepository.saveAndFlush(templatesLabels);
    }

    @Override
    public List<TemplatesLabels> findAllOrderByIdCode() {
        return templatesLabelsRepository.findAllOrderByIdCode();
    }
}

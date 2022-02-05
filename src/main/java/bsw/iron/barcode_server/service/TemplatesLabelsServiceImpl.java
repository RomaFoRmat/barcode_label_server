package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Code;
import bsw.iron.barcode_server.entity.TemplatesLabels;
import bsw.iron.barcode_server.entity.dto.TemplateLabelDTO;
import bsw.iron.barcode_server.repository.CodeRepository;
import bsw.iron.barcode_server.repository.TemplatesLabelsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<TemplatesLabels> findByIdCode(Long code) {
        List<Code> codeList = codeRepository.findByCode(String.valueOf(code));
        List<TemplatesLabels> templatesLabelsList = new ArrayList<>();
        if(!codeList.isEmpty()){
            templatesLabelsList = templatesLabelsRepository.findByIdCode(codeList.get(0).getCodePrimaryKey().getIdCode());
        }
        if (templatesLabelsList.isEmpty()) {
            templatesLabelsList = templatesLabelsRepository.findByIdTemplate(2L); //default
        }
        return templatesLabelsList;
    }


    @Override
    public TemplatesLabels saveAndFlush(TemplatesLabels templatesLabels) {
        return templatesLabelsRepository.saveAndFlush(templatesLabels);
    }

    @Override
    public List<TemplateLabelDTO> findAllOrderByIdCode() {
        List<TemplatesLabels> templatesLabelsList = templatesLabelsRepository.findAllOrderByIdCode();
        List<TemplateLabelDTO> templateLabelDTOS = new ArrayList<>();
        for(TemplatesLabels templatesLabels: templatesLabelsList){
            TemplateLabelDTO templateLabelDTO = new TemplateLabelDTO();
            templateLabelDTO.setTemplatesLabels(templatesLabels);
            Code code = codeRepository.findByIdKod(templatesLabels.getIdCode());
            templateLabelDTO.setKod(code.getCode());
            templateLabelDTOS.add(templateLabelDTO);
        }
        return templateLabelDTOS;
    }

    @Override
    public List<TemplatesLabels> findByIdTemplate(Long idTemplate) {
        return templatesLabelsRepository.findByIdTemplate(idTemplate);
    }

    @Override
    public void deleteByIdTemplate(Long idTemplate) {
        templatesLabelsRepository.deleteByIdTemplate(idTemplate);
    }

}

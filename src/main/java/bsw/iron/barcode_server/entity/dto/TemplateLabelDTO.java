package bsw.iron.barcode_server.entity.dto;

import bsw.iron.barcode_server.entity.Code;
import bsw.iron.barcode_server.entity.TemplatesLabels;
import lombok.Data;

import java.util.List;

@Data
public class TemplateLabelDTO {
    private String code;
    private Code.CodePrimaryKey codePrimaryKey;
    private List<TemplatesLabels> templatesLabelsList;
}

package bsw.iron.barcode_server.entity.dto;
import bsw.iron.barcode_server.entity.TemplatesLabels;
import lombok.Data;

@Data
public class TemplateLabelDTO {
    private TemplatesLabels templatesLabels;
    private String code;

}

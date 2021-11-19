package bsw.iron.barcode_server.entity.dto;

import bsw.iron.barcode_server.entity.Code;
import lombok.Data;

@Data
public class MainValueDTO {
    private Long idGroup;
    private Long idHead;
    private String value;
    private Double numberValue;
    private Code code;
}

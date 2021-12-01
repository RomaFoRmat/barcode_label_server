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
//поля для DateTable:
//    private DateTable.DateTableForeignKey dateTableForeignKey;
//    private LocalDateTime dateCreate;
//    private String whoCreate;
//    private Long laboratory;
//    private String ipAddressCreate;

}

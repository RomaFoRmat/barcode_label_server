package bsw.iron.barcode_server.entity.dto;

import bsw.iron.barcode_server.entity.Code;
import bsw.iron.barcode_server.entity.DateTable;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MainValueDTO {
    private Long idGroup;
    private Long idHead;
    private String value;
    private Double numberValue;
    private Code code;
    private DateTable.DateTableForeignKey dateTableForeignKey;
    private DateTable dateTable;
    private String whoCreate;
    private LocalDateTime dateCreate;
    private Long laboratory;
    private String ipAddressCreate;
}

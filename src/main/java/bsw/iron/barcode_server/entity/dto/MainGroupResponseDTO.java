package bsw.iron.barcode_server.entity.dto;

import bsw.iron.barcode_server.entity.Code;
import bsw.iron.barcode_server.entity.DateTable;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MainGroupResponseDTO {
    private Long idGroup;
    private Long idHead;
    private String value;
    private Double numberValue;
    private Code code;
//поля для DateTable
    private DateTable.DateTableForeignKey dateTableForeignKey;
    private LocalDateTime dateCreate;
    private String whoCreate;
    private Long laboratory;
    private String ipAddressCreate;

}

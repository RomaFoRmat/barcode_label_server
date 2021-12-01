package bsw.iron.barcode_server.entity.dto;

import bsw.iron.barcode_server.entity.DateTable;
import bsw.iron.barcode_server.entity.MainGroup;
import lombok.Data;

@Data
public class MainGroupResponseDTO {
    private MainGroup mainGroup;
    private DateTable dateTable;
}

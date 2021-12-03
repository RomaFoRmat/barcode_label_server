package bsw.iron.barcode_server.entity.dto;

import bsw.iron.barcode_server.entity.DateTable;
import bsw.iron.barcode_server.entity.ForeignGroup;
import lombok.Data;

@Data
public class ForeignGroupResponseDTO {
    private ForeignGroup foreignGroup;
    private DateTable dateTable;
}

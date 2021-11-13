package bsw.iron.barcode_server.entity.dto;

import bsw.iron.barcode_server.entity.MainGroup;
import lombok.Data;

import java.time.LocalDate;


@Data
public class TestValueDTO {
    private Long idForeignGroup;
    private MainGroup mainGroup;
    private String textValue;
    private Double value;
    private LocalDate dateValue;
    private Long idConversion;
    private Long idTestHead;
}

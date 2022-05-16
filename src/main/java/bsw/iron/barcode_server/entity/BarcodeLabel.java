package bsw.iron.barcode_server.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BARCODE_LABEL", schema = "HR")
public class BarcodeLabel {

    @Id
    @Column(name = "ID_FOREING_GROUP")
    private Long idForeignGroup;

    @Column(name = "ID_GROUP")
    private Long idGroup;

    @Column(name = "NUMBERSPOOL")
    private String numberSpool;

    @Column(name = "DATE_CREATE")
    @JsonProperty("timestamp")
    private LocalDateTime dateCreate;

    @Column(name = "KOD")
    private String code;

    @Column(name = "CONSTRUCT")
    private String construct;

    @Column(name = "CONSUMER_CODE")
    private String consumerCode;

    @Column(name = "LOT")
    private String lot;

    @Column(name = "PART")
    private String part;

    @Column(name = "RL")
    private String rl;

//    @Column(name = "TYPEBOBIN")
//    private String typeSpool;

    @Column(name = "LGHT")
    private String length;

    @Column(name = "SVAR")
    private Integer welds;

    @Column(name = "TORSION")
    private Double torsion;
}

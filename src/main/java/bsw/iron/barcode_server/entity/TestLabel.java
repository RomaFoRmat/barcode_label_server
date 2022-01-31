package bsw.iron.barcode_server.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TEST_BARCODE_LABEL", schema = "LABCZL")
public class TestLabel {

    @Id
    @Column(name = "ID_FOREING_GROUP")
    private Long idForeignGroup;

    @Column(name = "ID_GROUP")
    private Long idGroup;

    //    @Id
    @Column(name = "NUMBERSPOOL")
    private String numberSpool;

    //    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(name = "DATE_CREATE")
    @JsonProperty("timestamp")
    private LocalDateTime dateCreate;

    @Column(name = "DATAMARK")
    private LocalDate dateRope;

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

    @Column(name = "TYPEBOBIN")
    private String typeSpool;

    @Column(name = "NTAB")
    private String personalRope;

    @Column(name = "NSVAR")
    private Double numberWeldingMachine;

    @Column(name = "NKANMASH")
    private Integer numberRopeMachine;

    @Column(name = "LENGHTH")
    private Integer length;

    @Column(name = "SVAR")
    private Integer welds;

    @Column(name = "PR0")
    private Double straightforwardness600_0;

    @Column(name = "PR1")
    private Double straightforwardness600_1;

    @Column(name = "PR2")
    private Double straightforwardness600_2;

    @Column(name = "PR3")
    private Double straightforwardness600_3;

    @Column(name = "PR4")
    private Double straightforwardness600_4;

    @Column(name = "PR5")
    private Double straightforwardness600_5;

    @Column(name = "PRAVG")
    private Double straightforwardness600Avg;

    @Column(name = "STRAIGHT_ROPE")
    private Double straightforwardnessRope;

    @Column(name = "TORSION_ROPE") //В БД Неправильно указано название
    private Double torsRope;

    @Column(name = "STRAIGHT_300")
    private Double straightforwardness300;

    @Column(name = "TORSION")
    private Double torsion;

    @Column(name = "CODEDEFECT")
    private String codeDefect;

}

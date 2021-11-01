package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TEST_BARCODE_LABEL", schema = "LABCZL")
public class TestLabel {

    @Id
    @Column(name = "ID_FOREING_GROUP")
    private Long id_foreing_group;

    @Column(name = "ID_GROUP")
    private Long id_group;

//    @Id
    @Column(name = "NUMBERSPOOL")
    private String numberSpool;

    @Column(name = "DATE_CREATE")
    private LocalDate date_create;

    @Column(name = "KOD")
    private String code;

    @Column(name = "CONSTRUCT")
    private String construct;

//    @Column(name = "CONSUMER_CODE")
//    private String consumer_code;

    @Column(name = "LOT")
    private String lot;

    @Column(name = "PART")
    private String part;

    @Column(name = "RL")
    private String rl;

    @Column(name = "TYPEBOBIN")
    private String typeSpool;

    @Column(name = "NTAB")
    private String personal_rope;

    @Column(name = "LENGHTH")
    private Integer length;

    @Column(name = "SVAR")
    private Integer welds;

    @Column(name = "PR1")
    private Float straightforwardness1;

    @Column(name = "PR2")
    private Float straightforwardness2;

    @Column(name = "PR3")
    private Float straightforwardness3;

    @Column(name = "PR4")
    private Float straightforwardness4;

    @Column(name = "PR5")
    private Float straightforwardness5;

    @Column(name = "PRAVG")
    private Float straightforwardnessAvg;

//    @Column(name = "STRAIGHT_ROPE")
//    private Float straightforwardnessRope;
//
//    @Column(name = "TORSION_ROPE") //В БД Неправильно указано название
//    private Float torsRope;
//
//    @Column(name = "STRAIGHT_300")
//    private Float straightforwardness300;

    @Column(name = "TORSION")
    private Float torsion;

//    @Column(name = "CODEDEFECT")
//    private String codeDefect;

}

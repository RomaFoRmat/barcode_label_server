package bsw.iron.barcode_server.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "TEST_LABEL", schema = "LABCZL" )
public class TestLabel {

    @Id
    @Column(name = "ID_GROUP")
    private Long id_group;

    @Column(name = "DATE_CREATE")
    private LocalDate date_create;

    @Column(name="KOD")
    private String code;

    @Column(name = "LOT")
    private Integer lot;

    @Column(name="PART")
    private String part;

    @Column(name="RL")
    private String rl;

    @Column(name = "TYPEBOBIN")
    private String typeSpool;

    @Column(name = "NTAB")
    private String personal_rope;

    @Column(name = "LENGHTH")
    private Integer length;

    @Column(name = "NUMBSPOOL")
    private String numberSpool;

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

    @Column(name = "TORSKAN")
    private Float straightforwardnessRope;

    @Column(name = "BENDINGKAN") //В БД Неправильно указано название
    private Float torsRope;

    @Column(name = "BENDING_400")
    private Float straightforwardness300;

    @Column(name = "TORSION")
    private Float torsion;

    @Column(name = "CODEDEFFECT")
    private String codeDefect;

}

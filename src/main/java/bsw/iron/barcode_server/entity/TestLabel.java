package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TEST_LABEL", schema = "LABCZL" )
public class TestLabel {

    @Id
    @Column(name = "ID_GROUP")
    private Long id_group;

    @Column(name="DATE_CREATE")
    private Date date_create;

    @Column(name="KOD")
    private String code;

    @Column(name="LOT")
    private int lot;

    @Column(name="PART")
    private String part;

    @Column(name="RL")
    private String rl;

    @Column(name = "TYPEBOBIN")
    private String typeSpool;

    @Column(name = "NTAB")
    private String personal_rope;

    @Column(name="LENGHTH")
    private int length;

    @Column(name = "NUMBSPOOL")
    private String numberSpool;

    @Column(name="SVAR")
    private int welds;

    @Column(name = "PR1")
    private Integer straightforwardness1;

    @Column(name = "PR2")
    private Integer straightforwardness2;

    @Column(name = "PR3")
    private Integer straightforwardness3;

    @Column(name = "PR4")
    private Integer straightforwardness4;

    @Column(name = "PR5")
    private Integer straightforwardness5;

    @Column(name = "PRAVG")
    private Integer straightforwardnessAvg;

    @Column(name = "TORSKAN")
    private Integer torsRope;

    @Column(name = "BENDINGKAN")
    private Integer straightforwardnessRope;

    @Column(name = "BENDING_400")
    private Integer straightforwardness400;

    @Column(name="TORSION")
    private Integer torsion;

    @Column(name="CODEDEFFECT")
    private String codeDefect;


}

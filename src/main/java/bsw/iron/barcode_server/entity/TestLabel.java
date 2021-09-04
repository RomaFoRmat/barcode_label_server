package bsw.iron.barcode_server.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
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

    @Column(name="TYPEBOBIN")
    private String typeBobin;

    @Column(name="NTAB")
    private String tab_Kan;

    @Column(name="LENGHTH")
    private int length;

    @Column(name="NUMBSPOOL")
    private String numbSpool;

    @Column(name="SVAR")
    private int welds;

    @Column(name="PR1")
    private Integer pr1;

    @Column(name="PR2")
    private Integer pr2;

    @Column(name="PR3")
    private Integer pr3;

    @Column(name="PR4")
    private Integer pr4;

    @Column(name="PR5")
    private Integer pr5;

    @Column(name="PRAVG")
    private Integer prAvg;

    @Column(name="TORSKAN")
    private Integer torsKan;

    @Column(name="BENDINGKAN")
    private Integer bendingKan;

    @Column(name="BENDING_400")
    private Integer bending_400;

    @Column(name="TORSION")
    private Integer torsion;

    @Column(name="CODEDEFFECT")
    private String codeDefect;

    public TestLabel(Long id_group, Date date_create, String code, int lot, String part, String rl, String typeBobin, String tab_Kan, int length, String numbSpool, int welds, int pr1, int pr2, int pr3, int pr4, int pr5, int prAvg, int torsKan, int bendingKan, int bending_400, int torsion, String codeDefect) {
        this.id_group = id_group;
        this.date_create = date_create;
        this.code = code;
        this.lot = lot;
        this.part = part;
        this.rl = rl;
        this.typeBobin = typeBobin;
        this.tab_Kan = tab_Kan;
        this.length = length;
        this.numbSpool = numbSpool;
        this.welds = welds;
        this.pr1 = pr1;
        this.pr2 = pr2;
        this.pr3 = pr3;
        this.pr4 = pr4;
        this.pr5 = pr5;
        this.prAvg = prAvg;
        this.torsKan = torsKan;
        this.bendingKan = bendingKan;
        this.bending_400 = bending_400;
        this.torsion = torsion;
        this.codeDefect = codeDefect;
    }
}

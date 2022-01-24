package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEMPLATES_LABELS", schema = "LABCZL")
public class TemplatesLabels {

    @Id
    @Column(name = "ID_TEMPLATE")
    private Long idTemplate;

//    @OneToOne
//    @JoinColumn(name = "ID_CODE")
//    private Code.CodePrimaryKey code;

    @Column(name = "RUS_ENG")
    private Boolean languagelabel;
    @Column(name = "CONSTRUCT")
    private Boolean construct;
    @Column(name = "CODE")
    private Boolean code;
    @Column(name = "LR")
    private Boolean lr;
    @Column(name = "NUMBER_SPOOL")
    private Boolean numberSpool;
    @Column(name = "DATE_PRINT")
    private Boolean datePrint;
    @Column(name = "PART")
    private Boolean part;
    @Column(name = "LOT")
    private Boolean lot;
    @Column(name = "WELDS")
    private Boolean welds;
    @Column(name = "LENGTH_SPOOL")
    private Boolean lengthSpool;
}

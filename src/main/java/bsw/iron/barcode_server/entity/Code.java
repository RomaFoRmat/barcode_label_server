package bsw.iron.barcode_server.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CODE", schema = "LABCZL")
public class Code {

    @Id
    @Column(name = "ID_KOD")
    private Long idCode;

    @Column(name = "KOD")
    private String code;

    @Column(name = "OPISANIE")
    private String description;

    @ManyToOne
    @JoinColumn(name = "ID_PEREDEL")
    private Conversion conversion;

//    @Column(name = "DATE_EDIT")
//    private LocalDate dateEdit;

//    @Column(name = "WHOO_EDIT")
//    private String whoEdit;

//    @Column(name = "KOD_SAP")
//    private String codeSap;

    @Column(name = "VISIBLE")
    private Boolean visible;
}

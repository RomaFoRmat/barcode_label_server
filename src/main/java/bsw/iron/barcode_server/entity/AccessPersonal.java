package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DOSTUP_PERSONAL", schema = "LABCZL")
public class AccessPersonal {

    @EmbeddedId
    private AccessPersonalPrimaryKey accessPersonalPrimaryKey;

    @Column(name = "PASWORD")
    private String password;
    @Column(name = "DOSTUP_INTER_DATA")
    private Boolean accessInterData;
    @Column(name = "DOSTUP_EDIT_MAINTABLE")
    private Boolean accessEditMainTable;
    @Column(name = "DOSTUP_EDIT_TEXT_LIST")
    private Boolean accessEditTextList;
    @Column(name = "DOSTUP_EDIT_FOREINGTABLE")
    private Boolean accessEditForeignTable;
    @Column(name = "EDIT_MAIN_TABLE")
    private Boolean editMainTable;
    @Column(name = "EDIT_FOREING_TABLE")
    private Boolean editForeignTable;
    @Column(name = "PASWORD_DOSTUP")
    private Boolean passwordAccess;

    @Embeddable
    @Data
    @NoArgsConstructor
    public static class AccessPersonalPrimaryKey implements Serializable {
        @Column(name = "ID_LABORATORY")
        private Long idLaboratory;

        @Column(name = "ID_PEREDEL")
        private Long idConversion;

        @OneToOne
        @JoinColumn(name = "ID_PERSONAL")
        private Personals personals;


    }

}

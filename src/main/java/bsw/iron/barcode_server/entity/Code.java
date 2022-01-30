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
@Table(name = "CODE", schema = "HR")
public class Code {

    @EmbeddedId
    private CodePrimaryKey codePrimaryKey;

    @Column(name = "KOD")
    private String code;

    @Column(name = "OPISANIE")
    private String description;

    @Column(name = "VISIBLE")
    private Boolean visible;

    @Embeddable
    @Data
    @NoArgsConstructor
    public static class CodePrimaryKey implements Serializable {

        @Column(name = "ID_KOD")
        private Long idCode;

        @ManyToOne
        @JoinColumn(name = "ID_PEREDEL")
        private Conversion conversion;

    }


}

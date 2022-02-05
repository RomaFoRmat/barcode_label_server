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
@Table(name = "LABORATORY_PEREDEL", schema = "HR")
public class LaboratoryConversion {

    @EmbeddedId
    private LaboratoryUniqueKey laboratoryUniqueKey;

    @Embeddable
    @Data
    @NoArgsConstructor
    public static class LaboratoryUniqueKey implements Serializable {

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "ID_PEREDEL")
        private Conversion conversion;

        @OneToOne
        @JoinColumn(name = "ID_LABORATORY")
        private Laboratory laboratory;
    }


}

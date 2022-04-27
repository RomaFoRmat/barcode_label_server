package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PREDEL", schema = "LABCZL")
public class Limit {

    @EmbeddedId
    private LimitUniqueKey limitUniqueKey;

    @Column(name = "VISIBLE_ON_EDIT")
    private Boolean visible;

    @Embeddable
    @Data
    @NoArgsConstructor
    public static class LimitUniqueKey implements Serializable {

        @Column(name = "ID_TEST_HEAD")
        private Long idTestHead;

        @Column(name = "ID_KOD")
        private Long idCode;

        @Column(name = "ID_PEREDEL")
        private Long idConversion;
    }
}

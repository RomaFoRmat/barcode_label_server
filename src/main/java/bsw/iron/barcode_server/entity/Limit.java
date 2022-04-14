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
@Table(name = "PREDEL", schema = "HR")
public class Limit {
    @EmbeddedId
    private LimitUniqueKey limitUniqueKey;

    @Column(name = "VISIBLE_ON_EDIT")
    private Boolean visible;

    @Embeddable
    @Data
    @NoArgsConstructor
    public static class LimitUniqueKey implements Serializable {

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "ID_TEST_HEAD")
        private TestHead testHead;

        @Column(name = "ID_KOD")
        private Code.CodePrimaryKey codePK;
    }
}

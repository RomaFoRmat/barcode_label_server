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
@Table(name = "TEST_VALUE", schema = "HR")
public class TestValue {

    //Композитный PK

    @EmbeddedId
    private TestValuePrimaryKey testValuePrimaryKey;


    @Column(name = "TEXT_VALUE")
    private String textValue;

    @Column(name = "VALUE")
    private Double value;

    @Column(name = "ID_PEREDEL")
    private Integer idConversion;

    @Embeddable
    @Data
    @NoArgsConstructor
    public static class TestValuePrimaryKey implements Serializable {

        @Column(name = "ID_FOREING_GROUP")
        private Long idForeign;

        @Column(name = "ID_TEST_HEAD")
        private Long idTestHead;


    }


}


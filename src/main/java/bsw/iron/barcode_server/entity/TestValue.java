package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEST_VALUE", schema = "LABCZL")
public class TestValue {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_FOREING_GROUP")
    private ForeignGroup foreignGroup;

    @Column(name = "TEXT_VALUE")
    private String textValue;

    @Column(name = "VALUE")
    private Float value;

    @Id
    @Column(name = "ID_PEREDEL")
    private Integer idPeredel;


    @Column(name = "ID_TEST_HEAD")
    private Long idTestHead;


}


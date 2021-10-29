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
@Table(name = "TEST_VALUE", schema = "LABCZL")
public class TestValue {


//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "ID_FOREING_GROUP",referencedColumnName = "ID_FOREING_GROUP")
//    private ForeignGroup foreignGroup;

    /**
     * В данной таблице idForeign выступает в качестве внешнего ключа на табличку ForeignGroup, отношением @ManyTo one.
     *
     * @Id на внешний ключ задать не можем,Spring JPA это ненравится,а другие поля не укальны,т.к. значения могут
     * повторяться и будут траблы с выводом. Поэтому здесь связь не указываем.
     */

    @Id
    @Column(name = "ID_FOREING_GROUP")
    private Long idForeign;


    @Column(name = "TEXT_VALUE")
    private String textValue;

    @Column(name = "VALUE")
    private Double value;

    @Column(name = "ID_PEREDEL")
    private Integer idConversion;


    @Column(name = "ID_TEST_HEAD")
    private Long idTestHead;


}


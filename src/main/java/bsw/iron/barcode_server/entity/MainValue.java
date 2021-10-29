package bsw.iron.barcode_server.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MAIN_VOLUE", schema = "LABCZL")
public class MainValue {


//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "ID_GROUP")
//    private MainGroup idMainGroup;

 /**
  * В данной таблице idGroup выступает в качестве внешнего ключа на табличку MainGroup, отношением @ManyTo one.
  *
  * @Id на внешний ключ задать не можем,Spring JPA это ненравится, а другие поля не укальны,т.к. значения могут
  * повторяться и будут траблы с выводом. Поэтому здесь связь не указываем.
  */

    @Id
    @Column(name = "ID_GROUP")
    private Long idGroup;

    @OneToOne
    @JoinColumn()
    private HeadMain headMain;

    @Column(name = "VALUE")
    private String value;

    @Column(name = "NUMBER_VALUE")
    private Integer numberValue;


    @Column(name = "DATE_VALUE")
    private LocalDate dateValue;

}

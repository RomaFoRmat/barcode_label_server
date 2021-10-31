package bsw.iron.barcode_server.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MAIN_VOLUE", schema = "HR")
public class MainValue {

//Составной PK

   @EmbeddedId
   private MainValuePrimaryKey mainValuePrimaryKey ;

    @Column(name = "VALUE")
    private String value;

    @Column(name = "NUMBER_VALUE")
    private Integer numberValue;


    @Column(name = "DATE_VALUE")
    private LocalDate dateValue;

    @Embeddable
    @Data
    @NoArgsConstructor
    static class MainValuePrimaryKey implements Serializable {

       @Column(name = "ID_GROUP")
       private Long idGroup;

       @Column(name = "ID_HEAD")
       private  Long idHead;

   }

}

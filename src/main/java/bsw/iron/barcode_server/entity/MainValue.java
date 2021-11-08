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
@Table(name = "MAIN_VOLUE", schema = "LABCZL")
public class MainValue {

//Составной PK

    @EmbeddedId
    private MainValuePrimaryKey mainValuePrimaryKey;

    @Column(name = "VALUE")
    private String value;

    @Column(name = "NUMBER_VALUE")
    private Float numberValue;

//    @Column(name = "DATE_VALUE")
//    private LocalDate dateValue;

    @Embeddable
    @Data
    @NoArgsConstructor
    public static class MainValuePrimaryKey implements Serializable {

        @Column(name = "ID_GROUP")
        private Long idGroup;

        @Column(name = "ID_HEAD")
        private Long idHead;

    }

}

package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MAIN_VOLUE", schema = "LABCZL")
public class MainValue {


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_GROUP")
    private MainGroup idMainGroup;

    @OneToOne
    @JoinColumn()
    private HeadMain headMain;

    @Column(name = "VALUE")
    private String value;

    @Column(name = "NUMBER_VALUE")
    private Integer number_value;

    @Id
    @Column(name = "DATE_VALUE")
    private LocalDate date_value;

}

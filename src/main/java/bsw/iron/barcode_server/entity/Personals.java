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
@Table(name = "PERSONALS", schema = "HR")
public class Personals implements Serializable {

    @Id
    @Column(name = "ID_PERSONAL")
    private Long idPersonal;

    @Column(name = "FIO")
    private String fio;

    @Column(name = "TAB_NOMER")
    private Integer personnelNumber;

    @Column(name = "PASWORD")
    private String password;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_GROUP")
    private GroupsOfPersonal groupsOfPersonal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_LABORATORY")
    private Laboratory laboratory;


}

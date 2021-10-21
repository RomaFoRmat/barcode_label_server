package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSONALS", schema = "LABCZL")
public class Personals {

    @Id
    @Column(name = "ID_PERSONAL")
    private Integer id_personal;

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

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
@Table(name = "GROUPS_OF_PERSONALS", schema = "HR")
public class GroupsOfPersonal {

    @Id
    @Column(name = "ID_GROUP")
    private Long idGroup;

    @Column(name = "NAME_GROUP")
    private String nameGroup;
}

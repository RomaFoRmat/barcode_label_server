package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PEREDEL", schema = "LABCZL")
public class Peredel {

    @Id
    @Column(name = "ID_PEREDEL")
    private Integer idPeredel;

    @Column(name = "NAME_PEREDEL")
    private String namePeredel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private GroupPeredel idGroup;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="id_group")
//    private List<MainGroup> mainGroupList;

}

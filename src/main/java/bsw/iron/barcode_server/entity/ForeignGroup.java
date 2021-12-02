package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FOREIN_GROUP", schema = "HR")
public class ForeignGroup {

    @Id
    @Column(name = "ID_FOREING_GROUP")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOREING_SEQENCE")
    @SequenceGenerator(name = "FOREING_SEQENCE", sequenceName = "FOREING_SEQENCE", allocationSize = 1)
    private Long idForeignGroup;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_group")
    private MainGroup mainGroup;

//    @OneToMany
//    @JoinColumn(name="ID_FOREING_GROUP")
//    private List<TestValue> testValueList;


}

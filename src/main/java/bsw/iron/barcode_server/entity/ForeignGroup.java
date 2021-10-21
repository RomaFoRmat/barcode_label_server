package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FOREIN_GROUP", schema = "LABCZL")
public class ForeignGroup {

    @Id
    @Column(name = "ID_FOREING_GROUP")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOREING_SEQUENCE")
    @SequenceGenerator(name = "FOREING_SEQUENCE", sequenceName = "FOREING_SEQUENCE", allocationSize = 1)
    private Long idForeignGroup;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_group")
    private MainGroup mainGroup;
}

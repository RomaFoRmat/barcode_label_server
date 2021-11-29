package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MAIN_GROUP", schema = "HR")

public class MainGroup {

    @Id
    @Column(name = "ID_GROUP")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MAIN_GROUP_SEQ")
    @SequenceGenerator(name = "MAIN_GROUP_SEQ", sequenceName = "MAIN_GROUP_SEQ", allocationSize = 1)
    private Long idGroup;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_PEREDEL")
    private Conversion idConversion;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
@Column(name = "DATE_CREATE")
private LocalDateTime dateCreate;

//    @OneToMany(cascade = CascadeType.ALL )
//    @JoinColumn(name="ID_GROUP")
//    private List<ForeignGroup> foreignGroupList;


}

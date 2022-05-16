package bsw.iron.barcode_server.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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


    @Column(name = "DATE_CREATE")
//    @JsonProperty("timestamp")
    private LocalDateTime dateCreate;


}

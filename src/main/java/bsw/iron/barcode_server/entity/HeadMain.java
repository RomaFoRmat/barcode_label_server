package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HEAD_MAIN", schema = "HR")
public class HeadMain {

    @Id
    @Column(name = "ID_HEAD")
    private Long idHead;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_PEREDEL")
    private Conversion conversion;

    @Column(name = "NAME_HEAD")
    private String nameHead;

    @Column(name = "CAPTION_NAME")
    private String captionName;


}

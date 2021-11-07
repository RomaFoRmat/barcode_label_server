package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEST_HEAD", schema = "HR")
public class TestHead {

    @Id
    @Column(name = "ID_TEST_HEAD")
    private Integer idTestHead;

    @ManyToOne
    @JoinColumn(name = "ID_PEREDEL")
    private Conversion conversion;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CAPTION_NAME")
    private String captionName;


}

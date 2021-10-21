package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEST_HEAD", schema = "LABCZL")
public class TestHead {

    @Id
    @Column(name = "ID_TEST_HEAD")
    private Integer id_testHead;

    @ManyToOne
    @JoinColumn(name = "ID_PEREDEL")
    private Peredel peredel;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CAPTION_NAME")
    private String captionName;


}

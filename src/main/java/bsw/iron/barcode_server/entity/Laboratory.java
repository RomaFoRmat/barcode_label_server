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
@Table(name = "LABORATORY", schema = "LABCZL")
public class Laboratory {

    @Id
    @Column(name = "ID_LABORATORY")
    private Long idLaboratory;

    @Column(name = "LABORATORY_NAME")
    private String nameLaboratory;
}

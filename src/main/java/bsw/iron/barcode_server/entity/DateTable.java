package bsw.iron.barcode_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DATE_TABLE", schema = "HR")
public class DateTable {

    @EmbeddedId
    private DateTableForeignKey dateTableForeignKey;

    @Column(name = "LABORATORY")
    private Long laboratory;

    @Column(name = "DATE_CREATE")
    private LocalDateTime dateCreate;

    @Column(name = "WHOO_CREATE")
    private String whoCreate;

    @Column(name = "IP_ADRES_CREATE")
    private String ipAddressCreate;

    @Column(name = "DATE_EDIT")
    private LocalDateTime dateEdit;

    @Column(name = "WHOO_LAST_EDIT")
    private String whoLastEdit;

    @Column(name = "IP_ADRES_EDIT")
    private String ipAddressEdit;

    @Embeddable
    @Data
    @NoArgsConstructor
    public static class DateTableForeignKey implements Serializable {

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "ID_GROUP")
        private MainGroup mainGroup;

        @OneToOne
        @JoinColumn(name = "ID_FOREING_GROUP")
        private ForeignGroup foreignGroup;
    }

}

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
@Table(name = "GROUP_PEREDEL", schema = "HR")
public class GroupConversion {

   @Id
   @Column(name = "GROUP_ID")
   private Long idGroup;

   @Column(name = "NAME_GROUP")
   private String nameGroup;
}

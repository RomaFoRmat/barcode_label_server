package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.AccessPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccessPersonalRepository extends JpaRepository<AccessPersonal, AccessPersonal.AccessPersonalPrimaryKey> {

    @Query("SELECT ap FROM AccessPersonal ap WHERE ap.accessPersonalPrimaryKey.idConversion = 11690 AND ap.accessPersonalPrimaryKey.personals.idPersonal = :idPersonal")
//    @Query(value ="SELECT * FROM DOSTUP_PERSONAL WHERE ID_PEREDEL=11690 AND ID_PERSONAL = :ID_PERSONAL",nativeQuery = true )
    public List<AccessPersonal> findAllByAccessPersonalPrimaryKeyPersonalsIdPersonal(Long idPersonal);
}

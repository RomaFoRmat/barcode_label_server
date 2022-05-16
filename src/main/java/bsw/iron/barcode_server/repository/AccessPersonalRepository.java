package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.AccessPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccessPersonalRepository extends JpaRepository<AccessPersonal, AccessPersonal.AccessPersonalPrimaryKey> {

    /**
     * Поиск информации о пользователе для передела=11690 по idPersonal в таблице DOSTUP_PERSONAL:
     */
    @Query("SELECT ap FROM AccessPersonal ap WHERE ap.accessPersonalPrimaryKey.idConversion = 11690 AND" +
            " ap.accessPersonalPrimaryKey.personals.idPersonal = :idPersonal")
    List<AccessPersonal> findAllByAccessPersonalPrimaryKeyPersonalsIdPersonal(Long idPersonal);
}


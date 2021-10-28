package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.MainGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainGroupRepository extends JpaRepository<MainGroup, Long> {

    @Query("SELECT mg FROM MainGroup mg WHERE mg.idPeredel.idPeredel = 11690")
    public List<MainGroup> findAllByIdPeredel();

//    @Query(value="INSERT INTO MAIN_GROUP (ID_GROUP,ID_PEREDEL,DATE_CREATE) VALUES (MAIN_GROUP_SEQ.NEXTVAL, '11690', SYSDATE)",nativeQuery = true)
public MainGroup saveAndFlush(MainGroup mainGroup);


    public List<MainGroup> findByIdGroup(Long idGroup);


}

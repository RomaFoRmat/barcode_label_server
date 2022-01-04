package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.GroupsOfPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupsOfPersonalRepository extends JpaRepository<GroupsOfPersonal, Long> {

    /**
     * Получение информации о групе персонала по idGroup
     */
    @Query("SELECT gop FROM GroupsOfPersonal gop WHERE gop.idGroup = :idGroup")
    public List<GroupsOfPersonal> findAllByIdGroup(Long idGroup);
}

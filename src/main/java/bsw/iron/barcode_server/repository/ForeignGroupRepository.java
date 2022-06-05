package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.ForeignGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForeignGroupRepository extends JpaRepository<ForeignGroup, Long> {
    /**
     * Поиск всех значений  idForeignGroup для передела 11690
     */
    @Query("SELECT fg FROM ForeignGroup fg WHERE fg.mainGroup.idConversion.idConversion=11690")
    List<ForeignGroup> findAllByMainGroupIdConversionAndIdForeignGroup();


    /**
     * Поиск конкретного значения  по idForeignGroup для передела 11690
     */
    @Query("SELECT fg FROM ForeignGroup fg WHERE fg.mainGroup.idConversion.idConversion=11690 AND fg.idForeignGroup = :idForeignGroup")
    List<ForeignGroup> findByMainGroupIdConversionAndIdForeignGroup(Long idForeignGroup);

    /**
     * Создание подчиненной записи idForeignGroup.
     */
    ForeignGroup saveAndFlush(ForeignGroup foreignGroup);

    /**
     * Количество катушек в главной записи
     */
    @Query(value = "SELECT COUNT (*) FROM FOREIN_GROUP fg WHERE fg.ID_GROUP= :idGroup", nativeQuery = true)
    Integer findByMainGroupAmount(Long idGroup);


}

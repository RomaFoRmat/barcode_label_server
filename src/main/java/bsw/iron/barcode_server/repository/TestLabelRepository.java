package bsw.iron.barcode_server.repository;


import bsw.iron.barcode_server.entity.TestLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TestLabelRepository extends JpaRepository<TestLabel, Long> {

    //вывод информации по номеру катушки:
    @Query("SELECT tl FROM TestLabel tl WHERE tl.numberSpool = :numberSpool")
    List<TestLabel> findByNumberSpool(String numberSpool);

    //вывод всех катушек:
    @Query("SELECT tl FROM TestLabel tl")
    List<TestLabel> findAll();

    //вывод катушек за последние сутки:
    @Query(value = "SELECT * FROM BARCODE_LABEL  WHERE DATE_CREATE >= SYSDATE - 1", nativeQuery = true)
    List<TestLabel> findAllByDateCreate();

    //вывод катушек за определенный интервал времени:
    @Query("SELECT tl FROM TestLabel  tl WHERE  tl.dateCreate BETWEEN :dateCreateStart AND :dateCreateEnd")
    List<TestLabel> findAllByDateCreateBetween(LocalDateTime dateCreateStart, LocalDateTime dateCreateEnd);

    //вывод последних n записей:
    @Query(value= "SELECT * FROM (SELECT * FROM BARCODE_LABEL tbl) " +
            "WHERE ROWNUM <= :rowNum ORDER BY ROWNUM DESC",nativeQuery = true)
    List<TestLabel> findFirstValuesByRowNum(String rowNum);

}


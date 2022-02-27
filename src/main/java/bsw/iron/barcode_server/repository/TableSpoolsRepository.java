package bsw.iron.barcode_server.repository;


import bsw.iron.barcode_server.entity.TableSpools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TableSpoolsRepository extends JpaRepository<TableSpools, Long> {

    //вывод информации по номеру катушки:
    @Query("SELECT ts FROM TableSpools ts WHERE ts.numberSpool = :numberSpool")
    List<TableSpools> findByNumberSpool(String numberSpool);

    //вывод всех катушек:
    @Query("SELECT ts FROM TableSpools ts")
    List<TableSpools> findAll();

    //вывод катушек за последние сутки:
    @Query(value = "SELECT * FROM TEST_BARCODE_LABEL  WHERE DATE_CREATE >= SYSDATE - 1", nativeQuery = true)
    List<TableSpools> findAllByDateCreate();

    //вывод катушек за определенный интервал времени:
    @Query("SELECT ts FROM TableSpools  ts WHERE  ts.dateCreate BETWEEN :dateCreateStart AND :dateCreateEnd")
    List<TableSpools> findAllByDateCreateBetween(LocalDateTime dateCreateStart, LocalDateTime dateCreateEnd);

    //вывод последних n записей:
    @Query(value= "SELECT * FROM (SELECT * FROM TEST_BARCODE_LABEL tbl) " +
            "WHERE ROWNUM <= :rowNum ORDER BY ROWNUM DESC",nativeQuery = true)
    List<TableSpools> findFirstValuesByRowNum(String rowNum);

}


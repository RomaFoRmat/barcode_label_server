package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.BarcodeLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface BarcodeLabelRepository extends JpaRepository<BarcodeLabel, Long> {

//    вывод информации по номеру катушки:
    @Query("SELECT bl FROM BarcodeLabel bl WHERE bl.numberSpool = :numberSpool")
    List<BarcodeLabel> findByNumberSpool(String numberSpool);

//    @Query(value=
//            "SELECT * FROM BARCODE_LABEL bl WHERE bl.DATE_CREATE >= SYSDATE-:amountDays AND" +
//                    " bl.NUMBERSPOOL = :numberSpool",nativeQuery = true)
//    List<BarcodeLabel> findByNumberSpoolBetween(Integer amountDays,String numberSpool);

//    вывод информации по номеру катушки за период времени:
    @Query(value =
            "SELECT bl FROM BarcodeLabel bl WHERE bl.dateCreate BETWEEN :dateStart AND :dateEnd" +
                    " AND  bl.numberSpool = :numberSpool")
    List<BarcodeLabel> findByNumberSpoolBetween(LocalDateTime dateStart, LocalDateTime dateEnd, String numberSpool);
}

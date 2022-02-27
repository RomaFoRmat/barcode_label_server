package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.BarcodeLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BarcodeLabelRepository extends JpaRepository<BarcodeLabel, Long> {

    //вывод информации по номеру катушки:
    @Query("SELECT bl FROM BarcodeLabel bl WHERE bl.numberSpool = :numberSpool")
    List<BarcodeLabel> findByNumberSpool(String numberSpool);
}

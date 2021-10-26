package bsw.iron.barcode_server.repository;


import bsw.iron.barcode_server.entity.TestLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestLabelRepository extends JpaRepository<TestLabel, Long> {

//    @Query("SELECT tl FROM TestLabel  tl WHERE tl.date_create =(SELECT max(tl.date_create) FROM TestLabel tl)")
    public List<TestLabel> findByNumberSpool(String numberSpool);


}

package bsw.iron.barcode_server.repository;


import bsw.iron.barcode_server.entity.TestLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestLabelRepository extends JpaRepository<TestLabel, Long> {


    public List<TestLabel> findByNumberSpool(String numberSpool);


    @Query("SELECT tl FROM TestLabel tl ORDER BY tl.date_create DESC")
    public List<TestLabel> findAll();


}

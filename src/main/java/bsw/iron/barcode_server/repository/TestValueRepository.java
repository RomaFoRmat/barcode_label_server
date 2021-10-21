package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.TestValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestValueRepository extends JpaRepository<TestValue, Long> {

    @Query("SELECT tv FROM TestValue tv WHERE tv.idPeredel = 11690 and tv.idTestHead = 11697")
    public List<TestValue> findTestValuesByIdTestHeadAndIdPeredel();


}

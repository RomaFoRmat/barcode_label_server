package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.TestValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestValueRepository extends JpaRepository<TestValue, Long> {

    @Query("SELECT tv FROM TestValue tv WHERE tv.idPeredel = 11690 and tv.idTestHead = 11697")
    public List<TestValue> findAllByIdPeredelAndIdTestHead();

    @Query("SELECT tv FROM TestValue tv WHERE tv.idPeredel=11690")
    public Page<TestValue> findAllByIdPeredel(Pageable pageable);

//    @Query("SELECT tv, fg FROM TestValue tv, ForeignGroup  fg WHERE tv.idPeredel = 11690 and tv.idTestHead = 11697 and  tv.foreignGroup.idForeignGroup = fg.idForeignGroup " +
//            "and tv.idTestHead=11699 and  tv.foreignGroup.idForeignGroup = fg.idForeignGroup ")
//    public Page<TestValue> findAllByIdPeredel(Pageable pageable);


}

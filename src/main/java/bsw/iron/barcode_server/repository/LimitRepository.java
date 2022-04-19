package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.Limit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  LimitRepository extends JpaRepository<Limit, Limit.LimitUniqueKey> {

    @Query("SELECT l FROM Limit l WHERE l.limitUniqueKey.idConversion = 11690 AND" +
            " l.limitUniqueKey.idCode =:idCode AND l.limitUniqueKey.idTestHead = :idTestHead")
    List<Limit> findLimitByLimitUniqueKey(Long idCode, Long idTestHead);

    //Отобразить для заданного кода, все параметры которые visible=1
    @Query("SELECT l FROM Limit l WHERE l.limitUniqueKey.idConversion = 11690 AND l.limitUniqueKey.idCode =:idCode ")
    List<Limit> findByLimitUniqueKeyIdCode(Long idCode);
}

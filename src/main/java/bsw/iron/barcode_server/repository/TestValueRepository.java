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

    /**
     * Поиск значения (value либо textValue в зависимости от типа данных) в таблице TestValue по переделу = 11690(металлокорд) и idTestHead(id того или иного параметра)
     * idPeredel = 11690 (const) ;
     * idTestHead - используются все id value для данного передела
     */

    @Query("SELECT tv FROM TestValue tv WHERE tv.idPeredel = 11690 and tv.idTestHead = :idTestHead")
    public List<TestValue> findByIdPeredelAndIdTestHead(Long idTestHead);

    /**
     * Получение всех значений для передела 11690 (долго выполняется запрос  даже постранично и не корректно)
     * выдает одинаковые записи,возможно из-за того,что idForeign в TestValue выступает в роле @Id):
     */

    @Query("SELECT tv FROM TestValue tv WHERE tv.idPeredel=11690")
    public Page<TestValue> findAllByIdPeredel(Pageable pageable);

    @Query("SELECT tv FROM TestValue tv WHERE tv.idPeredel=11690")
    public List<TestValue> findAllByIdPeredel();


//    @Query("SELECT tv, fg FROM TestValue tv, ForeignGroup  fg WHERE tv.idPeredel = 11690 and tv.idTestHead = 11697 and  tv.foreignGroup.idForeignGroup = fg.idForeignGroup " +
//            "and tv.idTestHead=11699 and  tv.foreignGroup.idForeignGroup = fg.idForeignGroup ")
//    public Page<TestValue> findAllByIdPeredel(Pageable pageable);


}

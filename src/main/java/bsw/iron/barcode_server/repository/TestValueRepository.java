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

    //Здесь хранятся сами значения для подчиненной таблицы

 /**
  * Поиск значения (value либо textValue в зависимости от типа данных) в таблице TestValue по переделу = 11690(металлокорд) и idTestHead(id того или иного параметра)
  * idConversion = 11690 (const) ;
  * idTestHead - используются все id value для данного передела.
  */

    @Query("SELECT tv FROM TestValue tv WHERE tv.idConversion = 11690 and tv.testValuePrimaryKey = :idTestHead")
    public List<TestValue> findByIdConversionAndIdTestHead(Long idTestHead);

 /**
  * Получение всех значений подчиненной таблицы для передела 11690 постранично
  * (долго выполняется запрос и не корректно) почему то выдает выдает одинаковые записи.
  * Обычный вывод значений работает быстрее (но тоже долго)
  */

    @Query("SELECT tv FROM TestValue tv WHERE tv.idConversion=11690")
    public Page<TestValue> findAllByIdConversion(Pageable pageable);

 /**
  *  Получение всех значений подчиненной таблицы для передела 11690, отображается нормально, но соответственно долго
  */
    @Query("SELECT tv FROM TestValue tv WHERE tv.idConversion=11690")
    public List<TestValue> findAllByIdConversion();

    public TestValue saveAndFlush(TestValue testValue);



}

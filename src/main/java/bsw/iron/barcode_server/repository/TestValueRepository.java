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
     * Поиск значения (value/textValue в зависимости от типа данных) в таблице TestValue по переделу = 11690(металлокорд)
     * idConversion = 11690 (const); idTestHead - id названия параметра для данного передела.
     */
    @Query("SELECT tv FROM TestValue tv WHERE tv.idConversion = 11690 and tv.testValuePrimaryKey = :idTestHead")
    public List<TestValue> findByIdConversionAndIdTestHead(Long idTestHead);

    /**
     * Получение всех значений подчиненной таблицы для передела 11690 постранично(long request time):
     */
    @Query("SELECT tv FROM TestValue tv WHERE tv.idConversion=11690")
    public Page<TestValue> findAllByIdConversion(Pageable pageable);

    /**
     * Получение всех значений подчиненной таблицы для передела 11690(long request time,т.к. большой объем данных)
     */
    @Query("SELECT tv FROM TestValue tv WHERE tv.idConversion=11690")
    public List<TestValue> findAllByIdConversion();

    /**
     * Создать запись testValue:
     */
    public TestValue saveAndFlush(TestValue testValue);


}

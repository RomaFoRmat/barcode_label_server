package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.MainValue;
import bsw.iron.barcode_server.entity.TestValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainValueRepository extends JpaRepository<MainValue, Long> {

    //Здесь хранятся сами значения для главной таблицы
    //Здесь get запросы выдают ошибку---> ORA-00904: "MAINVALUE0_"."HEAD_MAIN_ID_HEAD": недопустимый идентификатор
/**
 * Поиск значения (value либо textValue в зависимости от типа данных) в таблице MainValue по переделу = 11690(металлокорд) и idtHead(id того или иного параметра)
 * idConversion = 11690 (const) ;
 * idHead - используются все id value для данного передела
 */
//    @Query("SELECT mv FROM MainValue mv WHERE mv.headMain.conversion.idConversion = 11690 AND mv.headMain.idHead= :idHead")
//    public List<MainValue> findByHeadMainConversionIdConversionAndHeadMainIdHead(Long idHead);

    @Query("SELECT mv FROM MainValue mv WHERE mv.mainValuePrimaryKey.idHead= :idHead")
    public List<MainValue> findByMainValuePrimaryKeyIdHead(Long idHead);




/**
 *  Получение всех значений главной таблицы для передела 11690, отображается нормально, но соответственно долго
 */
//    @Query("SELECT mv FROM MainValue mv WHERE mv.headMain.conversion.idConversion=11690")
//    public List<MainValue> findAllByHeadMain_Conversion_IdConversion();

    public List<MainValue> findAll();
}

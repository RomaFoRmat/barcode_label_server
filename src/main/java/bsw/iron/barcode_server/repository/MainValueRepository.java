package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.MainValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainValueRepository extends JpaRepository<MainValue, Long> {


/**
 * Поиск значения (value либо textValue в зависимости от типа данных) в таблице MainValue по переделу = 11690(металлокорд) и idtHead(id того или иного параметра)
 * idConversion = 11690 (const) ;
 * idHead - используются все id value для данного передела
 */
//    @Query("SELECT mv FROM MainValue mv WHERE mv.headMain.conversion.idConversion = 11690 AND mv.headMain.idHead= :idHead")
//    public List<MainValue> findByHeadMainConversionIdConversionAndHeadMainIdHead(Long idHead);
@Query("SELECT mv FROM MainValue mv WHERE mv.mainValuePrimaryKey.idHead = :idHead")
    public List<MainValue> findByMainValuePrimaryKeyIdHead(Long idHead);

    public Page<MainValue> findAll(Pageable pageable);


    /**
     * Получение всех значений главной таблицы для передела 11690
     */
//    @Query("SELECT mv FROM MainValue mv WHERE mv.headMain.conversion.idConversion=11690")
//    public List<MainValue> findAllByHeadMain_Conversion_IdConversion();
    public List<MainValue> findAll();

    public MainValue saveAndFlush(MainValue mainValue);
}

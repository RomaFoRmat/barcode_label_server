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
     * Поиск значения (value/textValue в зависимости от типа данных) в таблице MainValue по переделу = 11690(МК) и
     * idHead(id того или иного названия параметра)
     * idConversion = 11690 (const) ; idHead - используются все id value для данного передела
     */
    @Query("SELECT mv FROM MainValue mv WHERE mv.mainValuePrimaryKey.idHead = :idHead")
    public List<MainValue> findByMainValuePrimaryKeyIdHead(Long idHead);


    /**
     * Получение последнего max значения "протокол" за текущий год
     */
    @Query(value =
            "SELECT * FROM (SELECT NUMBER_VALUE from MAIN_VOLUE mv JOIN MAIN_GROUP mg on mv.id_group = mg.id_group " +
                    "WHERE mv.id_head = 1889350 AND mg.id_peredel=11690 " +
                    "AND TO_CHAR(TRUNC(mg.date_create,'YYYY'),'YYYY') = TO_CHAR(TRUNC(sysdate,'YYYY'),'YYYY') " +
                    "ORDER BY mg.date_create DESC ) WHERE rownum=1",
            nativeQuery = true)
    public List<String> findFirstByMainValuePrimaryKeyIdHead();


    /**
     * получение всех значений главной таблицы постранично:
     */
    public Page<MainValue> findAll(Pageable pageable);


    /**
     * Получение всех значений главной таблицы для передела 11690 (проблемы с выводом,т.к. большой объем данных):
     */
    public List<MainValue> findAll();

    /**
     * Создать запись mainValue:
     */
    public MainValue saveAndFlush(MainValue mainValue);
}

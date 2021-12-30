package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeRepository extends JpaRepository<Code, Long> {

 //здесь хранится справочник кодов, поле description(В БД "opisanie")

 /**
  * Получить все коды с видимостью = 1(true) для передела 11690, хранится в главной таблице в поле КОД как список текста
  */
 @Query("SELECT c FROM Code c WHERE c.codePrimaryKey.conversion.idConversion = 11690 AND c.visible = true ORDER BY c.code ")
 public List<Code> findAllByConversionIdConversion();

}

package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.MainGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainGroupRepository extends JpaRepository<MainGroup, Long> {

 /**
 *  Поиск всех idGroup(записей главной таблицы) для передела 11690(металлокорд):
 */
    @Query("SELECT mg FROM MainGroup mg WHERE mg.idConversion.idConversion = 11690")
    public List<MainGroup> findAllByIdConversion();

 /**
  *  Создание главной записи idMain, но почему то при запросе нужно в Body указывать все параметры именно со связями которые описаны в Entity MainGroup
  *  и указывать idGroup,хотя должен срабатывать sequence.?????????
  *  По идее idGroup должен sequence генерировать, idPeredel всегда будет равен 11690,а дата чтобы всегда текущая была.
  *  Снизу пытался @Query задать, но почему-то не вышло.
  */
//    @Query(value="INSERT INTO MAIN_GROUP (ID_GROUP,ID_PEREDEL,DATE_CREATE) VALUES (MAIN_GROUP_SEQ.NEXTVAL, '11690', SYSDATE)",nativeQuery = true)
    public MainGroup saveAndFlush(MainGroup mainGroup);

 /**
  * Поиск нужной idGroup записи по заданному idGroup в главной таблице:
  */
    public List<MainGroup> findByIdGroup(Long idGroup);


}

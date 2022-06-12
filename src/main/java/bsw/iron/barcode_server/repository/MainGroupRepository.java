package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.MainGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MainGroupRepository extends JpaRepository<MainGroup, Long> {

    /**
     * Поиск всех idGroup(записей главной таблицы) для передела 11690(металлокорд):
     */
    @Query("SELECT mg FROM MainGroup mg WHERE mg.idConversion.idConversion = 11690")
    List<MainGroup> findAllByIdConversion();

    /**
     * Создание главной записи idMain:
     */
    MainGroup saveAndFlush(MainGroup mainGroup);

    /**
     * Поиск нужной idGroup записи по заданному idGroup в главной таблице:
     */
    List<MainGroup> findByIdGroup(Long idGroup);

    /**
     * Вывод всех записей idGroup за месяц по убыванию:
     */
//    @Query("SELECT mg FROM MainGroup mg WHERE mg.idConversion.idConversion = 11690 ORDER BY mg.dateCreate DESC")
    @Query(value = "SELECT * FROM MAIN_GROUP mg WHERE mg.ID_PEREDEL = 11690 AND mg.DATE_CREATE > SYSDATE - 7 " +
            "ORDER BY mg.DATE_CREATE DESC",nativeQuery = true)
    List<MainGroup> findAllByDateCreateWeek();

    @Query(value = "SELECT * FROM MAIN_GROUP mg WHERE mg.ID_PEREDEL = 11690 AND mg.DATE_CREATE > SYSDATE - 31 " +
            "ORDER BY mg.DATE_CREATE DESC",nativeQuery = true)
    List<MainGroup> findAllByDateCreateMonth();

    @Query(value = "SELECT * FROM MAIN_GROUP mg WHERE mg.ID_PEREDEL = 11690 AND mg.DATE_CREATE > SYSDATE - 180 " +
            "ORDER BY mg.DATE_CREATE DESC",nativeQuery = true)
    List<MainGroup> findAllByDateCreateSixMonth();

    @Query(value = "SELECT * FROM MAIN_GROUP mg WHERE mg.ID_PEREDEL = 11690 AND mg.DATE_CREATE > SYSDATE - 180 " +
            "ORDER BY mg.DATE_CREATE DESC",nativeQuery = true)
    List<MainGroup> findAllByDateCreateSixMonths();

    @Query(value = "SELECT * FROM MAIN_GROUP mg WHERE mg.ID_PEREDEL = 11690 AND mg.DATE_CREATE > SYSDATE - 365 " +
            "ORDER BY mg.DATE_CREATE DESC",nativeQuery = true)
    List<MainGroup> findAllByDateCreateYear();

    @Query(value = "SELECT mg FROM MainGroup mg WHERE mg.idConversion.idConversion=11690 " +
            "AND mg.dateCreate BETWEEN :dateStart AND :dateEnd ORDER BY mg.dateCreate DESC")
    List<MainGroup> findAllByDateCreateBetween(LocalDateTime dateStart, LocalDateTime dateEnd);
}

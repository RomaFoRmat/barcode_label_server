package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.MainGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainGroupRepository extends JpaRepository<MainGroup, Long> {

    /**
     * Поиск всех idGroup(записей главной таблицы) для передела 11690(металлокорд):
     */
    @Query("SELECT mg FROM MainGroup mg WHERE mg.idConversion.idConversion = 11690")
    public List<MainGroup> findAllByIdConversion();

    /**
     * Создание главной записи idMain:
     */
    public MainGroup saveAndFlush(MainGroup mainGroup);

    /**
     * Поиск нужной idGroup записи по заданному idGroup в главной таблице:
     */
    public List<MainGroup> findByIdGroup(Long idGroup);

    /**
     * Вывод всех записей idGroup по убыванию:
     */
    @Query("SELECT mg FROM MainGroup mg WHERE mg.idConversion.idConversion = 11690 ORDER BY mg.dateCreate DESC")
    public List<MainGroup> findAllByIdConversionOrderByDateCreateDateCreateDesc();

}

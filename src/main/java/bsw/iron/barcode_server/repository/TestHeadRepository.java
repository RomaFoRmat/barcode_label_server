package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.TestHead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestHeadRepository extends JpaRepository<TestHead, Long> {

    // Здесь хранятся captionName и их idTestHead для
    /**
     * Получение всех наименований (caption) значений для передела 11690 в подчиненной таблице
     */
    @Query("SELECT th FROM TestHead th WHERE th.conversion.idConversion=11690")
    public List<TestHead> findAllByConversionIdConversion();
}

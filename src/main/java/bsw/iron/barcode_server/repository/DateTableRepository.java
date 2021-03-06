package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.DateTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateTableRepository extends JpaRepository<DateTable, DateTable.DateTableForeignKey> {
    //Создать запись DATE_TABLE
    DateTable saveAndFlush(DateTable dateTable);

}

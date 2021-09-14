package bsw.iron.barcode_server.repository;


import bsw.iron.barcode_server.entity.TestLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestLabelRepository extends JpaRepository<TestLabel, Long> {

    public List<TestLabel> findByNumberSpool(String numberSpool);

    public List<TestLabel> findAll();

}

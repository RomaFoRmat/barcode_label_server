package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.ForeignGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForeignGroupRepository extends JpaRepository<ForeignGroup, Long> {

    public List<ForeignGroup> findAll();
}

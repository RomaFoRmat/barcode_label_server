package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.MainGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ForeignGroupRepository extends JpaRepository<ForeignGroup, Long> {

    @Query("SELECT fg FROM ForeignGroup fg WHERE fg.mainGroup.idPeredel.idPeredel=11690")
    public List<ForeignGroup> findAllByMainGroup();

    @Query("SELECT fg FROM ForeignGroup fg WHERE fg.mainGroup.idPeredel.idPeredel=11690")
    public List<ForeignGroup> findByMainGroup(MainGroup mainGroup);

//    public ForeignGroup saveAndFlush(ForeignGroup foreignGroup, Long idGroup);

    public ForeignGroup saveAndFlush(ForeignGroup foreignGroup);

}

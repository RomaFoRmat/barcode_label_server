package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.Personals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalsRepository extends JpaRepository<Personals, Long> {
   public List<Personals> findByPassword(String password);

   public List<Personals> findAll();
}

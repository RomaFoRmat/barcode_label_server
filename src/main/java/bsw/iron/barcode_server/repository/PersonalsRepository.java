package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.Personals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonalsRepository extends JpaRepository<Personals, Long> {
   public Personals findByPassword(String password);

   public List<Personals> findAll();
}

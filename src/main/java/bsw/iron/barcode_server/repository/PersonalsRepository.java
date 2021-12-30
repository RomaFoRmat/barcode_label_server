package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.Personals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalsRepository extends JpaRepository<Personals, Long> {
   /**
    * Поиск пользователя по паролю:
    */
   public List<Personals> findByPassword(String password);

   /**
    * Вывод всех пользователей:
    */
   public List<Personals> findAll();
}

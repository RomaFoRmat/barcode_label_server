package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.TemplatesLabels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplatesLabelsRepository extends JpaRepository<TemplatesLabels,Long> {

    //вывод информации по IdCode:
    @Query("SELECT tl FROM TemplatesLabels tl WHERE tl.idCode = :idCode")
    public List<TemplatesLabels> findByIdCode(Long idCode);

    //Создать шаблон:
    public TemplatesLabels saveAndFlush(TemplatesLabels templatesLabels);

    //вывод всех шаблонов
    @Query("SELECT tl FROM TemplatesLabels tl ORDER BY tl.idCode")
    public List<TemplatesLabels> findAllOrderByIdCode();

    public void deleteByIdTemplate(Long idTemplate);
}
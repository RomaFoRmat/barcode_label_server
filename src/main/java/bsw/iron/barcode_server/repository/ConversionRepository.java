package bsw.iron.barcode_server.repository;

import bsw.iron.barcode_server.entity.Conversion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversionRepository extends JpaRepository<Conversion, Integer> {

}

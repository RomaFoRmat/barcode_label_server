package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.entity.dto.MainGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.MainGroupResponseDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MainGroupService {

    List<MainGroup> findAllByIdConversion();
    @Transactional
    MainGroupResponseDTO addIdMain(MainGroupRequestDTO mainGroupRequestDTO);
    List<MainGroup> findByIdGroup(Long idGroup);
    List<MainGroup> findAllByIdConversionOrderByDateCreateDateCreateDesc();


}

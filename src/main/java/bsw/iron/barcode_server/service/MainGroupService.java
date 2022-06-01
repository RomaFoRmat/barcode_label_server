package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.entity.dto.MainGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.MainGroupResponseDTO;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

public interface MainGroupService {

    List<MainGroup> findAllByIdConversion();
    @Transactional
    MainGroupResponseDTO addIdMain(MainGroupRequestDTO mainGroupRequestDTO);
    List<MainGroup> findByIdGroup(Long idGroup);
    List<MainGroup> findAllByDateCreateWeek();
    List<MainGroup> findAllByDateCreateMonth();
    List<MainGroup> findAllByDateCreateSixMonth();
    List<MainGroup> findAllByDateCreateYear();
    List<MainGroup> findAllByDateCreateBetween(LocalDateTime dateStart, LocalDateTime dateEnd);


}

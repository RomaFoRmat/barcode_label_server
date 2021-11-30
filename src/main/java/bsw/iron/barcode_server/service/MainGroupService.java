package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.entity.dto.MainGroupResponseDTO;

import java.util.List;

public interface MainGroupService {

    public List<MainGroup> findAllByIdConversion();

//    public MainGroup addIdMain(MainGroup mainGroup);

    public List<MainGroup> findByIdGroup(Long idGroup);

    public List<MainGroup> findAllByIdConversionOrderByDateCreateDateCreateDesc();

    public MainGroup addIdMain(List<MainGroupResponseDTO> mainGroupResponseDTOS);
}

package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.dto.ForeignGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.ForeignGroupResponseDTO;

import java.util.List;

public interface ForeignGroupService {

    List<ForeignGroup> findByMainGroupIdConversionAndIdForeignGroup(Long idForeignGroup);
    ForeignGroupResponseDTO addIdForeign(ForeignGroupRequestDTO foreignGroupRequestDTO);
//    public ForeignGroup addIdForeign(List<TestValueDTO> testValueDTOs);
    List<ForeignGroup> findAllByMainGroupIdConversionAndIdForeignGroup();

}

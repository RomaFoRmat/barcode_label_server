package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.dto.ForeignGroupRequestDTO;
import bsw.iron.barcode_server.entity.dto.ForeignGroupResponseDTO;

import java.util.List;

public interface ForeignGroupService {

    public List<ForeignGroup> findByMainGroupIdConversionAndIdForeignGroup(Long idForeignGroup);

    public ForeignGroupResponseDTO addIdForeign(ForeignGroupRequestDTO foreignGroupRequestDTO);

//    public ForeignGroup addIdForeign(List<TestValueDTO> testValueDTOs);

    public List<ForeignGroup> findAllByMainGroupIdConversionAndIdForeignGroup();

}

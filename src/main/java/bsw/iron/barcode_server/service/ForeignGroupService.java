package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.dto.TestValueDTO;

import java.util.List;

public interface ForeignGroupService {

    public List<ForeignGroup> findByMainGroupIdConversionAndIdForeignGroup(Long idForeignGroup);


    public ForeignGroup addIdForeign(List<TestValueDTO> testValueDTOs);

    public List<ForeignGroup> findAllByMainGroupIdConversionAndIdForeignGroup();

}

package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.MainGroup;

import java.util.List;

public interface ForeignGroupService {


    public List<ForeignGroup> findByMainGroupIdConversionAndIdForeignGroup(Long idForeignGroup);

//    public ForeignGroup saveAndFlush(ForeignGroup foreignGroup, Long idGroup);

    public ForeignGroup saveAndFlush(ForeignGroup foreignGroup);

    public List<ForeignGroup> findAllByMainGroupIdConversionAndIdForeignGroup();

}

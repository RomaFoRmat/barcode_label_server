package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.MainGroup;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ForeignGroupService {

    public List<ForeignGroup> findAllByMainGroup();

    public List<ForeignGroup> findByMainGroup(MainGroup mainGroup);

//    public ForeignGroup saveAndFlush(ForeignGroup foreignGroup, Long idGroup);

    public ForeignGroup saveAndFlush(ForeignGroup foreignGroup);
}

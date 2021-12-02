package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.GroupsOfPersonal;
import bsw.iron.barcode_server.entity.Laboratory;

import java.util.List;

public interface GroupsOfPersonalService {
    public List<GroupsOfPersonal> findAllByIdGroup(Long idGroup);
}


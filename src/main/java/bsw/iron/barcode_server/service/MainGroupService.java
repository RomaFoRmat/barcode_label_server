package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainGroup;

import java.util.List;

public interface MainGroupService {

    public List<MainGroup> findAllByIdPeredel();

    public MainGroup addIdMain(MainGroup mainGroup);

    public List<MainGroup> findByIdGroup(Long idGroup);
}

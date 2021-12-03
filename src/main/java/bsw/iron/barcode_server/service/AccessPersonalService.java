package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.AccessPersonal;

import java.util.List;

public interface AccessPersonalService {

    public List<AccessPersonal> findAllByAccessPersonalPrimaryKeyPersonalsIdPersonal(Long idPersonal);
}

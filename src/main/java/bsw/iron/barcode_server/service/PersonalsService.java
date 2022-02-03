package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Personals;

import java.util.List;

public interface PersonalsService {

    List<Personals> findByPassword(String password);
    List<Personals> findAll();
}

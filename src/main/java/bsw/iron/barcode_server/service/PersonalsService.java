package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Personals;

import java.util.List;

public interface PersonalsService {

    public Personals findByPassword(String password);

    public List<Personals> findAll();
}

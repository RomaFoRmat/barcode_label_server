package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Personals;
import bsw.iron.barcode_server.repository.PersonalsRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonalsServiceImpl implements PersonalsService {

    private final PersonalsRepository personalsRepository;


    public PersonalsServiceImpl(PersonalsRepository personalsRepository) {
        this.personalsRepository = personalsRepository;
    }

    @Override
    public Personals findByPassword(String password) {
        return personalsRepository.findByPassword(password);
    }

    @Override
    public List<Personals> findAll() {
        return personalsRepository.findAll();
    }
}

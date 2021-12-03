package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.AccessPersonal;
import bsw.iron.barcode_server.repository.AccessPersonalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessPersonalServiceImpl implements AccessPersonalService {

    private final AccessPersonalRepository accessPersonalRepository;

    public AccessPersonalServiceImpl(AccessPersonalRepository accessPersonalRepository) {
        this.accessPersonalRepository = accessPersonalRepository;
    }

    public List<AccessPersonal> findAllByAccessPersonalPrimaryKeyPersonalsIdPersonal(Long idPersonal) {
        return accessPersonalRepository.findAllByAccessPersonalPrimaryKeyPersonalsIdPersonal(idPersonal);
    }
}

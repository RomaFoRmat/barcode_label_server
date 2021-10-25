package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.repository.MainGroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainGroupServiceImpl implements MainGroupService {

    private final MainGroupRepository mainGroupRepository;

    public MainGroupServiceImpl(MainGroupRepository mainGroupRepository) {
        this.mainGroupRepository = mainGroupRepository;
    }

    @Override
    public List<MainGroup> findAllByIdPeredel() {
        return mainGroupRepository.findAllByIdPeredel();
    }

    @Override
    public MainGroup addIdMain(MainGroup mainGroup) {

        return mainGroupRepository.saveAndFlush(mainGroup);
    }

    @Override
    public List<MainGroup> findByIdGroup(Long idGroup) {
        return mainGroupRepository.findByIdGroup(idGroup);
    }
}

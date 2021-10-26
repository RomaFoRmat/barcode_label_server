package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.repository.ForeignGroupRepository;
import bsw.iron.barcode_server.repository.MainGroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ForeignGroupServiceImpl implements ForeignGroupService {

    private final ForeignGroupRepository foreignGroupRepository;

    public ForeignGroupServiceImpl(ForeignGroupRepository foreignGroupRepository) {
        this.foreignGroupRepository = foreignGroupRepository;
    }

    @Override
    public List<ForeignGroup> findAllByMainGroup() {
        return foreignGroupRepository.findAllByMainGroup();
    }

    @Override
    public List<ForeignGroup> findByMainGroup(MainGroup mainGroup) {
        return foreignGroupRepository.findByMainGroup(mainGroup);
    }

    @Override
    public ForeignGroup saveAndFlush(ForeignGroup foreignGroup) {
        return foreignGroupRepository.saveAndFlush(foreignGroup);
    }

//    @Override
//    public ForeignGroup saveAndFlush(ForeignGroup foreignGroup, Long idGroup) {
//        mainGroupRepository.getById(idGroup);
//        return foreignGroupRepository.saveAndFlush(foreignGroup);
//    }
}

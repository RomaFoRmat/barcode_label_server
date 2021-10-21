package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.ForeignGroup;
import bsw.iron.barcode_server.repository.ForeignGroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeignGroupServiceImpl implements ForeignGroupService {

    private final ForeignGroupRepository foreignGroupRepository;

    public ForeignGroupServiceImpl(ForeignGroupRepository foreignGroupRepository) {
        this.foreignGroupRepository = foreignGroupRepository;
    }

    @Override
    public List<ForeignGroup> findAll() {
        return foreignGroupRepository.findAll();
    }
}

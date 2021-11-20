package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainValue;
import bsw.iron.barcode_server.repository.MainValueRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainValueServiceImpl implements MainValueService {

    private final MainValueRepository mainValueRepository;

    public MainValueServiceImpl(MainValueRepository mainValueRepository) {
        this.mainValueRepository = mainValueRepository;
    }

    @Override
    public List<MainValue> findByMainValuePrimaryKeyIdHead(Long idHead) {
        return mainValueRepository.findByMainValuePrimaryKeyIdHead(idHead);
    }

    @Override
    public List<String> findFirstByMainValuePrimaryKeyIdHeadOrderByNumberValueDesc() {
        return mainValueRepository.findFirstByMainValuePrimaryKeyIdHeadOrderByNumberValueDesc();
    }

    @Override
    public List<MainValue> findAll() {
        return mainValueRepository.findAll();
    }

    @Override
    public Page<MainValue> findAll(Pageable pageable) {
        return mainValueRepository.findAll(pageable);
    }

    @Override
    public MainValue saveAndFlush(MainValue mainValue) {
        return mainValueRepository.saveAndFlush(mainValue);
    }
}

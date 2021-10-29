package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.MainValue;
import bsw.iron.barcode_server.entity.TestValue;
import bsw.iron.barcode_server.repository.MainValueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainValueServiceImpl implements MainValueService {

    private final MainValueRepository mainValueRepository;

    public MainValueServiceImpl(MainValueRepository mainValueRepository) {
        this.mainValueRepository = mainValueRepository;
    }

    @Override
    public List<MainValue> findByHeadMainConversionIdConversionAndHeadMainIdHead(Long idHead) {
        return mainValueRepository.findByHeadMainConversionIdConversionAndHeadMainIdHead(idHead);
    }

    @Override
    public List<MainValue> findAllByHeadMain_Conversion_IdConversion() {
        return mainValueRepository.findAllByHeadMain_Conversion_IdConversion();
    }
}

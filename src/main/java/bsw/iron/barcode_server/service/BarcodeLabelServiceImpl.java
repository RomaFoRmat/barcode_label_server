package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.BarcodeLabel;
import bsw.iron.barcode_server.repository.BarcodeLabelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarcodeLabelServiceImpl implements BarcodeLabelService {

    private final BarcodeLabelRepository barcodeLabelRepository;

    public BarcodeLabelServiceImpl(BarcodeLabelRepository barcodeLabelRepository) {
        this.barcodeLabelRepository = barcodeLabelRepository;
    }

    @Override
    public List<BarcodeLabel> findByNumberSpool(String numberSpool) {
        return barcodeLabelRepository.findByNumberSpool(numberSpool);
    }
}

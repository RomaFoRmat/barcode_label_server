package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.BarcodeLabel;
import bsw.iron.barcode_server.entity.TableSpools;
import bsw.iron.barcode_server.repository.BarcodeLabelRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class BarcodeLabelServiceImpl implements BarcodeLabelService {

    private final BarcodeLabelRepository barcodeLabelRepository;

    public BarcodeLabelServiceImpl(BarcodeLabelRepository barcodeLabelRepository) {
        this.barcodeLabelRepository = barcodeLabelRepository;
    }

    @Override
    public List<BarcodeLabel> findByNumberSpool(String numberSpool) {
        System.out.println(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + " Request started");
        List<BarcodeLabel> list = barcodeLabelRepository.findByNumberSpool(numberSpool);
        System.out.println(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + " Request ended");
        return list;

    }

    @Override
    public List<BarcodeLabel> findByNumberSpoolBetween(LocalDateTime dateStart,
                                                       LocalDateTime dateEnd, String numberSpool) {
        System.out.println(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + " Request started");
        List<BarcodeLabel> list = barcodeLabelRepository.findByNumberSpoolBetween(dateStart,dateEnd,numberSpool);
        System.out.println(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + " Request ended");
        return list;
    }
}

package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.DateTable;
import bsw.iron.barcode_server.repository.DateTableRepository;
import org.springframework.stereotype.Service;

@Service
public class DateTableServiceImpl implements DateTableService {

    private final DateTableRepository dateTableRepository;

    public DateTableServiceImpl(DateTableRepository dateTableRepository) {
        this.dateTableRepository = dateTableRepository;
    }

    @Override
    public DateTable saveAndFlush(DateTable dateTable) {
        return dateTableRepository.saveAndFlush(dateTable);
    }
}

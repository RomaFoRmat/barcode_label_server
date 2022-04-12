package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Limit;
import bsw.iron.barcode_server.repository.LimitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LimitServiceImpl implements  LimitService {
    private final LimitRepository limitRepository;

    public LimitServiceImpl(LimitRepository limitRepository) {
        this.limitRepository = limitRepository;
    }

    @Override
    public List<Limit> findLimitByLimitUniqueKey(Long idCode, Long idTestHead) {
        return limitRepository.findLimitByLimitUniqueKey(idCode,idTestHead);
    }

    @Override
    public List<Limit> findLimitByLimitUniqueKeyCodePK(Long idCode) {
        return limitRepository.findLimitByLimitUniqueKeyCodePK(idCode);
    }
}

package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Limit;
import bsw.iron.barcode_server.entity.LimitDTO;
import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.entity.MainValue;
import bsw.iron.barcode_server.repository.CodeRepository;
import bsw.iron.barcode_server.repository.LimitRepository;
import bsw.iron.barcode_server.repository.MainGroupRepository;
import bsw.iron.barcode_server.repository.MainValueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LimitServiceImpl implements  LimitService {
    private final MainGroupRepository mainGroupRepository;
    private final MainValueRepository mainValueRepository;
    private final CodeRepository codeRepository;
    private final LimitRepository limitRepository;


    public LimitServiceImpl(MainGroupRepository mainGroupRepository, MainValueRepository mainValueRepository, CodeRepository codeRepository, LimitRepository limitRepository) {
        this.mainGroupRepository = mainGroupRepository;
        this.mainValueRepository = mainValueRepository;
        this.codeRepository = codeRepository;
        this.limitRepository = limitRepository;
    }

    @Override
    public List<Limit> findLimitByLimitUniqueKey(Long idCode, Long idTestHead) {
        return limitRepository.findLimitByLimitUniqueKey(idCode,idTestHead);
    }

//    @Override
//    public List<Limit> findLimitByLimitUniqueKeyCodePK(LimitDTO limitDTO) {
//        List<MainGroup> byIdGroup = mainGroupRepository.findByIdGroup(limitDTO.getMainGroup().getIdGroup());
//        return null;
//    }

    @Override
    public List<Limit> findLimitByLimitUniqueKeyCodePK(Long idCode) {
        return limitRepository.findLimitByLimitUniqueKeyCodePK(idCode);
    }
}

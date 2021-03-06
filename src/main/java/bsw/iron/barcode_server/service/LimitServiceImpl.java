package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Code;
import bsw.iron.barcode_server.entity.Limit;
import bsw.iron.barcode_server.entity.MainGroup;
import bsw.iron.barcode_server.repository.CodeRepository;
import bsw.iron.barcode_server.repository.LimitRepository;
import bsw.iron.barcode_server.repository.MainGroupRepository;
import bsw.iron.barcode_server.repository.MainValueRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LimitServiceImpl implements  LimitService {
    private final MainGroupRepository mainGroupRepository;
    private final MainValueRepository mainValueRepository;
    private final CodeRepository codeRepository;
    private final LimitRepository limitRepository;


    public LimitServiceImpl(MainGroupRepository mainGroupRepository, MainValueRepository mainValueRepository,
                            CodeRepository codeRepository, LimitRepository limitRepository) {
        this.mainGroupRepository = mainGroupRepository;
        this.mainValueRepository = mainValueRepository;
        this.codeRepository = codeRepository;
        this.limitRepository = limitRepository;
    }

    @Override
    public List<Limit> findLimitByLimitUniqueKey(Long idCode, Long idTestHead) {
        return limitRepository.findLimitByLimitUniqueKey(idCode,idTestHead);
    }


    @Override
    public List<Limit> findByLimitUniqueKeyIdCode(Long idCode) {
//        MainGroup mainGroup = new MainGroup();
//        Long idGroup = mainGroup.getIdGroup();
//        Long byValue11691 = mainValueRepository.findByValue11691(idGroup);
//        Code code = codeRepository.findByIdKod(byValue11691);
//        List<Limit>limitList = new ArrayList<>();
//        if(code !=null){
//            limitList = limitRepository.findByLimitUniqueKeyIdCode(code.getCodePrimaryKey().getIdCode());
//        }
//        return limitList;
       return limitRepository.findByLimitUniqueKeyIdCode(idCode);
    }
}

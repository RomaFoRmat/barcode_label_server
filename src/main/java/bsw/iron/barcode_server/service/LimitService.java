package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.Limit;

import java.util.List;

public interface LimitService {
    List<Limit> findLimitByLimitUniqueKey(Long idCode, Long idTestHead);
    List<Limit> findByLimitUniqueKeyIdCode(Long idCode);
//    List<Limit> findLimitByLimitUniqueKeyCodePK(LimitDTO limitDTO);
}

package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.Limit;
import bsw.iron.barcode_server.service.LimitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class LimitController {
    private final LimitService limitService;

    public LimitController(LimitService limitService) {
        this.limitService = limitService;
    }

    @GetMapping("/show-visible/{idCode}/{idTestHead}")
    public List<Limit> findLimitByLimitUniqueKey(@PathVariable Long idCode,
                                                 @PathVariable Long idTestHead) {
        return limitService.findLimitByLimitUniqueKey(idCode,idTestHead);
    }

    @GetMapping("/show-experience/{idCode}")
    List<Limit> findByLimitUniqueKeyIdCode(@PathVariable Long idCode){
        return limitService.findByLimitUniqueKeyIdCode(idCode);
    }
}

package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.AccessPersonal;
import bsw.iron.barcode_server.service.AccessPersonalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class AccessPersonalController {
    private final AccessPersonalService accessPersonalService;

    public AccessPersonalController(AccessPersonalService accessPersonalService) {
        this.accessPersonalService = accessPersonalService;
    }

    @GetMapping("/getAccessPersonal/{idPersonal}")
    public List<AccessPersonal> findAllByAccessPersonalPrimaryKeyPersonalsIdPersonal(@PathVariable Long idPersonal) {
        return accessPersonalService.findAllByAccessPersonalPrimaryKeyPersonalsIdPersonal(idPersonal);
    }
}

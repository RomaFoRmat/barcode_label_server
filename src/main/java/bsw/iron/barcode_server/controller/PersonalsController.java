package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.Personals;
import bsw.iron.barcode_server.service.PersonalsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/personals/")
public class PersonalsController {

    private final PersonalsService personalsService;

    public PersonalsController(PersonalsService personalsService) {
        this.personalsService = personalsService;
    }

    @GetMapping("/{password}")
    public List<Personals> getUser(@PathVariable String password) {
        try {
            return personalsService.findByPassword(password);
        } catch (Exception exc) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, exc.getMessage(), exc);
        }
    }

    @GetMapping("/all")
    public List<Personals> getAllUsers() {
        return personalsService.findAll();
    }
}

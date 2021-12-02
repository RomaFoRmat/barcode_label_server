package bsw.iron.barcode_server.controller;

import bsw.iron.barcode_server.entity.GroupsOfPersonal;
import bsw.iron.barcode_server.service.GroupsOfPersonalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class GroupsOfPersonalController {

    private final GroupsOfPersonalService groupsOfPersonalService;

    public GroupsOfPersonalController(GroupsOfPersonalService groupsOfPersonalService) {
        this.groupsOfPersonalService = groupsOfPersonalService;
    }

    @GetMapping("/getGroupsOfPersonal/{idGroup}")
    public List<GroupsOfPersonal> findAllByIdGroup(@PathVariable Long idGroup) {
        return groupsOfPersonalService.findAllByIdGroup(idGroup);
    }
}

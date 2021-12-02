package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.GroupsOfPersonal;
import bsw.iron.barcode_server.repository.GroupsOfPersonalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupsOfPersonalServiceImpl implements GroupsOfPersonalService {

    private final GroupsOfPersonalRepository groupsOfPersonalRepository;

    public GroupsOfPersonalServiceImpl(GroupsOfPersonalRepository groupsOfPersonalRepository) {
        this.groupsOfPersonalRepository = groupsOfPersonalRepository;
    }

    @Override
    public List<GroupsOfPersonal> findAllByIdGroup(Long idGroup) {
        return groupsOfPersonalRepository.findAllByIdGroup(idGroup);
    }
}

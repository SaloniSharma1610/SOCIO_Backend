package com.society.SocioHomes.service;

import com.society.SocioHomes.entity.Roles;
import com.society.SocioHomes.entity.SocietyRegForUser;
import com.society.SocioHomes.entity.UserEntity;
import com.society.SocioHomes.repo.RoleRepo;
import com.society.SocioHomes.repo.SocietyRegRepo;
import com.society.SocioHomes.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class AdminService {

    @Autowired
    UserRepo  userRepo;

    @Autowired
    SocietyRegRepo regRepo;

    @Autowired
    RoleRepo roleRepo;

    public String assignRole(Roles roles){
        roleRepo.save(roles);
        Long requestId=regRepo.findByUserId(roles.getUserId()).getSocietyUserRegId();
        regRepo.deleteById(requestId);
        return "Role assign successfully";

    }

    public String rejectRole(Roles roles){
        Long requestId=regRepo.findByUserId(roles.getUserId()).getSocietyUserRegId();
        regRepo.deleteById(requestId);
        return "request deleted successfully";

    }

    public SocietyRegForUser societyRegistration(SocietyRegForUser reg){
        return regRepo.save(reg);
    }

    public List<SocietyRegForUser> getAllRequests(){
        return regRepo.findAll().stream()
                .filter(reg -> reg.getStatus().equalsIgnoreCase("pending")
                                                && reg.getRequestedRole().equalsIgnoreCase("societyadmin"))
                .collect(Collectors.toList());
    }

    public List<SocietyRegForUser> getRequestByUserIdAndSocietyId(String userId, String societyId){
        if(roleRepo.findByUserId(userId).getRole().equalsIgnoreCase("societyadmin"))
        {
            return regRepo.findAll().stream()
                    .filter(reg -> reg.getStatus().equalsIgnoreCase("pending") &&
                            reg.getSocietyId().equalsIgnoreCase(societyId))
                    .filter(reg -> !reg.getRequestedRole().equalsIgnoreCase("societyadmin"))
                    .collect(Collectors.toList());
        }

        return null;
    }
}

package com.society.SocioHomes.service;

import com.society.SocioHomes.entity.Roles;
import com.society.SocioHomes.entity.SocietyRegForUser;
import com.society.SocioHomes.entity.UserEntity;
import com.society.SocioHomes.mapper.UserContext;
import com.society.SocioHomes.model.LoginDetails;
import com.society.SocioHomes.repo.RoleRepo;
import com.society.SocioHomes.repo.SocietyRegRepo;
import com.society.SocioHomes.repo.SocietyRepo;
import com.society.SocioHomes.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    SocietyRegRepo societyRegRepo;

    @Autowired
    RoleRepo roleRepo;

    public UserContext doLogin(LoginDetails loginDetails){
        UserContext userContext = new UserContext();
        UserEntity user=userRepo.findByUserName(loginDetails.getUserName());
        Roles roles= new Roles();
        userContext.setUserEntity(user);
        Roles assignedRole=roleRepo.findByUserId(user.getUserId().toString());
        SocietyRegForUser societyRegForUser=societyRegRepo.findByUserId
                (user.getUserId().toString());
        if(societyRegForUser==null && assignedRole==null){
            roles=null;
        }
        else if(assignedRole == null && societyRegForUser.getStatus().equalsIgnoreCase("pending"))
        {
            roles.setRole("");
            roles.setUserId("");
            roles.setSocietyId(societyRegForUser.getSocietyId());
            roles.setRole("");
        }
        else {
            roles=assignedRole;
        }

        userContext.setRolesDetails(roles);
        return userContext;
    }

    public UserEntity saveUser(UserEntity user) {
        user = userRepo.save(user); // First save to generate userId
        String shortUUID = UUID.randomUUID().toString().substring(0, 5);
        user.setUserName("user_" + user.getUserId() + "_" + shortUUID);
        return userRepo.save(user); // Save again to persist username
    }

}


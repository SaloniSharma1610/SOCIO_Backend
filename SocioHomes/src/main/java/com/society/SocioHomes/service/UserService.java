package com.society.SocioHomes.service;

import com.society.SocioHomes.entity.UserEntity;
import com.society.SocioHomes.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public UserEntity saveUser(UserEntity entity){
        return userRepo.save(entity);
    }
}


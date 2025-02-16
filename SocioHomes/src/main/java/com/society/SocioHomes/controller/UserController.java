package com.society.SocioHomes.controller;

import com.society.SocioHomes.entity.UserEntity;
import com.society.SocioHomes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    UserEntity addUser(@RequestBody UserEntity userEntity){
        return userService.saveUser(userEntity);
    }
}

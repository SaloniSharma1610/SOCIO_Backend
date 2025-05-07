package com.society.SocioHomes.controller;

import com.society.SocioHomes.entity.SocietyRegForUser;
import com.society.SocioHomes.entity.UserEntity;
import com.society.SocioHomes.mapper.UserContext;
import com.society.SocioHomes.model.Complaints;
import com.society.SocioHomes.model.LoginDetails;
import com.society.SocioHomes.model.UserDetails;
import com.society.SocioHomes.service.AdminService;
import com.society.SocioHomes.service.ComplaintsService;
import com.society.SocioHomes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AdminService adminService;

    @Autowired
     ComplaintsService complaintsService;



    @PostMapping
    @RequestMapping("/login")
    public UserContext doLogin(@RequestBody LoginDetails loginDetails){
        return userService.doLogin(loginDetails);
    }

    @PostMapping("/signup")
    UserEntity addUser(@RequestBody UserEntity userEntity){
        return userService.saveUser(userEntity);
    }

    @PostMapping
    @RequestMapping("/society/registration")
    public SocietyRegForUser registration(@RequestBody SocietyRegForUser reg){
        return adminService.societyRegistration(reg);
    }

    @PostMapping("/complaints/submit")
    public ResponseEntity<String> submit(@RequestBody Complaints complaints) {
        complaintsService.saveComplaint(complaints);
         return ResponseEntity.ok("Your complaint raised successfully!");

    }

}

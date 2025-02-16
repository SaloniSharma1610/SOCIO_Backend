package com.society.SocioHomes.controller;

import com.society.SocioHomes.entity.SocietyAdminEntity;
import com.society.SocioHomes.model.LoginDetails;
import com.society.SocioHomes.service.EnrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/society")
public class EnrollController {

    @Autowired
    EnrollService enrollService;

    @CrossOrigin(origins = "*")
    @PostMapping("/save")
    SocietyAdminEntity saveUser(@RequestBody SocietyAdminEntity societyAdminEntity){
         return enrollService.saveTo(societyAdminEntity);

    }

    @PostMapping("/Adminlogin")
    String saveUser(@RequestBody LoginDetails loginDetails){
        return enrollService.LoginSocietyAdmin(loginDetails);

    }

    @GetMapping("/getAllIds")
    List<Long> getSocietyIds(){
        return enrollService.getAllSocietyIdList();
    }
}

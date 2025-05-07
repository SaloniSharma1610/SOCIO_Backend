package com.society.SocioHomes.controller;

import com.society.SocioHomes.entity.Roles;
import com.society.SocioHomes.entity.SocietyRegForUser;
import com.society.SocioHomes.model.Complaints;
import com.society.SocioHomes.service.AdminService;
import com.society.SocioHomes.service.ComplaintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;


    @PostMapping
    @RequestMapping("/roleassign")
    String assignRole(@RequestBody Roles assignedRole) {
        return adminService.assignRole(assignedRole);
    }

    @DeleteMapping
    @RequestMapping("/rolereject")
    String rejectRole(@RequestBody Roles rejectRole) {
        return adminService.rejectRole(rejectRole);
    }

    @GetMapping
    @RequestMapping("/adminrequest")
    public List<SocietyRegForUser> getAllRequests() {
        return adminService.getAllRequests();
    }


    @GetMapping("/request/{userId}/society/{societyId}")
    public List<SocietyRegForUser> getUserByIdAndSocietyId(@PathVariable String userId,
                                                           @PathVariable String societyId) {
        return adminService.getRequestByUserIdAndSocietyId(userId, societyId);

    }


}

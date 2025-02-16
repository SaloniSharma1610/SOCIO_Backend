package com.society.SocioHomes.service;

import com.society.SocioHomes.entity.SocietyAdminEntity;
import com.society.SocioHomes.model.LoginDetails;
import com.society.SocioHomes.repo.SocietyAdminDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnrollService {

    @Autowired
    SocietyAdminDetailsRepo societyAdminDetailsRepo;

    public SocietyAdminEntity saveTo(SocietyAdminEntity societyAdminEntity){
        return societyAdminDetailsRepo.save(societyAdminEntity);
    }

    public String LoginSocietyAdmin(LoginDetails loginDetails){
        Optional<SocietyAdminEntity> entity=societyAdminDetailsRepo.findById(loginDetails.getUserId());
         if(entity.isEmpty()){
             return "User ID not found";
         }
         else{
             if(entity.get().getPassword().equals(loginDetails.getUserPassword()))
                 return  "Login successfull";
             else{
                 return  "passwork incorrect";

             }
         }
    }

    public List<Long> getAllSocietyIdList(){
        return societyAdminDetailsRepo.findAll()
                .stream()
                .map(societyAdminEntity -> societyAdminEntity.getSocietyId())
                .collect(Collectors.toList());
    }
}

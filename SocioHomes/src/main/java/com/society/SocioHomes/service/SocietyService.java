package com.society.SocioHomes.service;

import com.society.SocioHomes.entity.Society;
import com.society.SocioHomes.repo.SocietyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocietyService {

    @Autowired
    SocietyRepo societyRepo;

    public Society saveSociety(Society society){
        return societyRepo.save(society);
    }

    public List<Society> getAll(){
        return  societyRepo.findAll();
    }
}

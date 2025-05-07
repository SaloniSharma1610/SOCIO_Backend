package com.society.SocioHomes.controller;

import com.society.SocioHomes.entity.Society;
import com.society.SocioHomes.service.SocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/society")
public class SocietyController {

    @Autowired
    SocietyService societyService;

    @PostMapping("/save")
    public Society saveUser(@RequestBody Society society) {
        return societyService.saveSociety(society);
    }

    @GetMapping("/getall")
    public List<Society>  getAllSociety(){
        return societyService.getAll();
    }
}

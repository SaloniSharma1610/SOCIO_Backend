package com.society.SocioHomes.service;

import com.society.SocioHomes.entity.ComplaintsEntity;
import com.society.SocioHomes.model.Complaints;
import com.society.SocioHomes.repo.ComplaintsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ComplaintsService {

    @Autowired
    ComplaintsRepo complaintsRepo;

    public ComplaintsEntity saveComplaint(Complaints complaints){
        ComplaintsEntity complaintsEntity=new ComplaintsEntity();
        complaintsEntity.setResidentName(complaints.getResidentName());
        complaintsEntity.setFlatNumber(complaints.getFlatNumber());
        complaintsEntity.setComplaintText(complaints.getComplaintText());
        complaintsEntity.setCreatedAt(LocalDateTime.now());
        complaintsEntity.setResolved(false);
        complaintsEntity.setComplaintType(complaints.getComplaintType());
        System.out.println(complaintsEntity);
        return complaintsRepo.save(complaintsEntity);

    }
}

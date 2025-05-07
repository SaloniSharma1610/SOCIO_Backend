package com.society.SocioHomes.repo;

import com.society.SocioHomes.entity.SocietyRegForUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocietyRegRepo extends JpaRepository<SocietyRegForUser, Long> {
    SocietyRegForUser  findByUserId(String userId);
    void deleteByUserId(String  userId);
}

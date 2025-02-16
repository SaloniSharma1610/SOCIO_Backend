package com.society.SocioHomes.repo;

import com.society.SocioHomes.entity.SocietyAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocietyAdminDetailsRepo extends JpaRepository <SocietyAdminEntity,Long>{
}

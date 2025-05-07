package com.society.SocioHomes.repo;

import com.society.SocioHomes.entity.Society;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocietyRepo extends JpaRepository<Society, Long> {
}

package com.society.SocioHomes.repo;

import com.society.SocioHomes.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepo extends JpaRepository<Roles,Long> {

    Roles findByUserId(String userId);
}
package com.society.SocioHomes.repo;

import com.society.SocioHomes.entity.ComplaintsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintsRepo extends JpaRepository<ComplaintsEntity,Long > {

    List<ComplaintsEntity> findByResolvedFalse();
}

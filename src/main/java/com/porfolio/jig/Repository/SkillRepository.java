package com.porfolio.jig.Repository;

import com.porfolio.jig.Model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skills,Long>{
    
}

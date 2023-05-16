package com.porfolio.jig.Repository;

import com.porfolio.jig.Model.Studie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudieRepository extends JpaRepository<Studie,Long>{
    
}

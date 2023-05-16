package com.porfolio.jig.Service;

import com.porfolio.jig.Model.Skills;
import com.porfolio.jig.Repository.SkillRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    
    public SkillRepository sklRepo;
    
    @Override
    public List<Skills> listSkills() {
        return sklRepo.findAll();
    }

    @Override
    public void createSkill(Skills skl) {
        sklRepo.save(skl);
    }

    @Override
    public void deleteSkill(Long id) {
        sklRepo.deleteById(id);
    }

    @Override
    public Skills searchSkill(Long id) {
        return sklRepo.findById(id).orElse(null);
    }
    
}

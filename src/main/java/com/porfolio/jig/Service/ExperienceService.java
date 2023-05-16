package com.porfolio.jig.Service;

import com.porfolio.jig.Model.Experience;
import com.porfolio.jig.Repository.ExperienceRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService {
    
    public ExperienceRepository expRepo;
    
    @Override
    public List<Experience> listExperiences() {
        return expRepo.findAll();
    }

    @Override
    public void createExperience(Experience exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteExperience(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience searchExperience(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
}

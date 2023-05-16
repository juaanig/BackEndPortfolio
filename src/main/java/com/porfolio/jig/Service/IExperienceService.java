package com.porfolio.jig.Service;

import com.porfolio.jig.Model.Experience;
import java.util.List;


public interface IExperienceService {
    
    public List<Experience> listExperiences();
    public void createExperience(Experience exp);
    public void deleteExperience(Long id);
    public Experience searchExperience(Long id);

    
}

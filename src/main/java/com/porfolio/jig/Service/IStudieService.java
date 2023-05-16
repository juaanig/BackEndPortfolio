package com.porfolio.jig.Service;

import com.porfolio.jig.Model.Studie;
import java.util.List;


public interface IStudieService {
    
    public List<Studie> listStudie();
    public void createStudie(Studie skl);
    public void deleteStudie(Long id);
    public Studie searchStudie(Long id);
    
}

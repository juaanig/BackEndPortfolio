package com.porfolio.jig.Service;

import com.porfolio.jig.Model.Studie;
import com.porfolio.jig.Repository.StudieRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudieService implements IStudieService {
    
    public StudieRepository stdRepo;

    @Override
    public List<Studie> listStudie() {
        return stdRepo.findAll();
    }

    @Override
    public void createStudie(Studie skl) {
        stdRepo.save(skl);
    }

    @Override
    public void deleteStudie(Long id) {
        stdRepo.deleteById(id);
    }

    @Override
    public Studie searchStudie(Long id) {
        return stdRepo.findById(id).orElse(null);
    }
    
}

package com.porfolio.jig.Controller;

import com.porfolio.jig.Model.Experience;
import com.porfolio.jig.Model.Skills;
import com.porfolio.jig.Model.Studie;
import com.porfolio.jig.Service.IExperienceService;
import com.porfolio.jig.Service.ISkillService;
import com.porfolio.jig.Service.IStudieService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juang
 */

@RestController
public class Controller {
    
    //===================================================
    @Autowired
    private IExperienceService expServ;
    
    @PostMapping("/new/exp")
    public void addExperience(@RequestBody Experience exp){
        expServ.createExperience(exp);
    }
    
    @GetMapping("/list/experience")
    @ResponseBody
    public List<Experience> listExperiences(){
        return expServ.listExperiences();
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteExperience (@PathVariable Long id){
        expServ.deleteExperience(id);
    }
    //===================================================
    
    //===================================================
    @Autowired
    private ISkillService sklServ;
    
    @PostMapping("/new/skl")
    public void addSkill(@RequestBody Skills skl){
        sklServ.createSkill(skl);
    }
    
    @GetMapping("/list/skills")
    @ResponseBody
    public List<Skills> listSkills(){
        return sklServ.listSkills();
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteSkill (@PathVariable Long id){
        sklServ.deleteSkill(id);
    }
    //===================================================
    
    //===================================================
    @Autowired
    private IStudieService stdServ;
    
    @PostMapping("/new/std")
    public void addStudie(@RequestBody Studie std){
        stdServ.createStudie(std);
    }
    
    @GetMapping("/list/studies")
    @ResponseBody
    public List<Studie> listStudies(){
        return stdServ.listStudie();
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteStudie (@PathVariable Long id){
        stdServ.deleteStudie(id);
    }
    //===================================================
}

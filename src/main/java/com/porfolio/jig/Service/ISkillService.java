
package com.porfolio.jig.Service;

import com.porfolio.jig.Model.Skills;
import java.util.List;

/**
 *
 * @author juang
 */
public interface ISkillService {
    
    public List<Skills> listSkills();
    public void createSkill(Skills skl);
    public void deleteSkill(Long id);
    public Skills searchSkill(Long id);
}

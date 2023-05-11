/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.jig.Service;

import com.porfolio.jig.Model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author juang
 */

public interface IPersonaService { 
    
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);

    
    
}

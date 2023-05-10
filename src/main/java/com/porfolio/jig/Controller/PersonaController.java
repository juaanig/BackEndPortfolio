/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.jig.Controller;

import com.porfolio.jig.Model.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juang
 */

@RestController
public class PersonaController {
    
    List<Persona> listaPersonas = new ArrayList();
    
    //GET PARA RETORNAR VALORES A CLIENTE SECUENCIA: BBDD > API > CLIENTE
    @GetMapping("/hola/{name}")
    public String dataPersona(@PathVariable String name){
        return "Hola "+ name;
    }

    //POST PARA AGREGAR VALORES A BBDD SECUENCIA: CLIENTE > API > BBDD
    @PostMapping("/persona")
    public void createPersona(@RequestBody String persona){
        System.out.println("persona: "+ persona);
    }
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        listaPersonas.add(pers);
    }
    
    @GetMapping("/ver/personas")
    public List<Persona> verPerosnas(){
        return listaPersonas;
    }
    
    
    
    
    
}

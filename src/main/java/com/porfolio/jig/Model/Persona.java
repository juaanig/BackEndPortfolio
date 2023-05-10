/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.jig.Model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author juang
 */
@Getter @Setter
public class Persona {
    
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    public Persona(){}

    public Persona(Long id, String nombre, String apellido, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    

    
}

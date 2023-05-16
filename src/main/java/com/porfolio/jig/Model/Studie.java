package com.porfolio.jig.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Studie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String title;
    private String description;
    
    
    public Studie(){}

    public Studie(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}

package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class LibroIsaac {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long id;
    private String titulo;
    private String descripcion;
    


    @ManyToOne
    @JoinColumn(name = "autor_id")
    private AutorIsaac autorIsaac;

    
}

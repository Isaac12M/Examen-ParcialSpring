package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class AutorIsaac{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long autor_id;
    private String name;
    private LocalDate birthdate;
    private Boolean activo;

    @OneToMany(mappedBy = "autorIsaac")
    private List<LibroIsaac> libroIsaac;

}
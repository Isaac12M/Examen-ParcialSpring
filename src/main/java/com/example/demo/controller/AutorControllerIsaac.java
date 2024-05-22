package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AutorIsaac;
import com.example.demo.service.AutorServiceIsaac;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/autores")
@Tag(name="Examen API")
public class AutorControllerIsaac {
     @Autowired
    private AutorServiceIsaac autorServiceIsaac; 
   
    @PostMapping 
    @Operation(summary = "Create a new Autor")
    public AutorIsaac saveIsaac(@RequestBody AutorIsaac entity) {
        return autorServiceIsaac.saveIsaac(entity); 
    }

    
    @GetMapping 
    @Operation(summary  = "View a list of available Autores")
    public List<AutorIsaac> getAllAutores() {
        return autorServiceIsaac.findAll(); 
    }

    
    @DeleteMapping("/{name}")
    @Operation(summary = "Delete an Autor by name")
    public void deleteAutor(@PathVariable("name") String name) {
        autorServiceIsaac.deleteAutorByName(name);
    }


    
}

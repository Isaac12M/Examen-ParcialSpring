package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AutorIsaac;
import com.example.demo.repository.AutorRepositoryIsaac;

import jakarta.transaction.Transactional;

@Service
public class AutorServiceIsaac {
    
    @Autowired
    private AutorRepositoryIsaac autorRepositoryIsaac;


    public AutorIsaac saveIsaac(AutorIsaac entity) {
        return autorRepositoryIsaac.save(entity);
    }
    public List<AutorIsaac> findAll() {
        return (List<AutorIsaac>) autorRepositoryIsaac.findAll();
    }
    @Transactional 
    public void deleteAutorByName(String name) {
        autorRepositoryIsaac.deleteAutorByName(name);
    }
   
    
    
}

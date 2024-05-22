package com.example.demo.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.AutorIsaac;

public interface AutorRepositoryIsaac extends CrudRepository<AutorIsaac, Long> {
    AutorIsaac findByName(String name);

    @Modifying
    @Query("DELETE FROM AutorIsaac a WHERE a.name = :name")
    void deleteAutorByName(@RequestParam("name") String name);
}
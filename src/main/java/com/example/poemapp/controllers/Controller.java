package com.example.poemapp.controllers;

import com.example.poemapp.models.Poem;
import com.example.poemapp.models.repo.PoemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private PoemRepo poemRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/poems")
    public List<Poem> getPoems() {
        return poemRepo.findAll();
    }
}

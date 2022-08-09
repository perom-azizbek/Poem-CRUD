package com.example.poemapp.controllers;

import com.example.poemapp.models.Poem;
import com.example.poemapp.models.repo.PoemRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private PoemRepo poemRepo;

    //Welcome demo
    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    //READS(GET) array of data
    @GetMapping(value = "/poems")
    public List<Poem> getPoems() {
        return poemRepo.findAll();
    }

    //CREATES(POST) array of data
    @PostMapping(value = "/save")
    public String savePoem(@RequestBody Poem poem) {
        poemRepo.save(poem);
        return "Saving!";
    }
}

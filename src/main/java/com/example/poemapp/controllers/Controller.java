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
    //UPDATES(PUT) poem with specific id
    @PutMapping(value = "update/{id}")
    public String updatePoem(@PathVariable long id, @RequestBody Poem poem) {
        Poem updatedPoem = poemRepo.findById(id).get();
        updatedPoem.setTitle(poem.getTitle());
        updatedPoem.setAuthor(poem.getAuthor());
        updatedPoem.setDescription(poem.getDescription());
        updatedPoem.setYear(poem.getYear());
        poemRepo.save(updatedPoem);
        return  "Poem updated...";
    }

    //DELETES poem with specific id
    @DeleteMapping(value = "/delete/{id}")
    public String deletePoem(@PathVariable long id) {
        Poem deletePoem = poemRepo.findById(id).get();
        poemRepo.delete(deletePoem);
        return "Poem {id} has been deleted...";
    }


}

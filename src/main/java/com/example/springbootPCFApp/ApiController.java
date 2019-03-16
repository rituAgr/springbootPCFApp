package com.example.springbootPCFApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @Autowired
    private ApiRepository repo;

    @GetMapping("/prof/{id}")
    public Professor getProf(@PathVariable String id){
     return repo.findById(id).get();
    }

    @PostMapping("/prof")
    public void saveProf(@RequestBody Professor professor){
        repo.save(professor);
    }
}

package com.example.scuola.controllers;

import com.example.scuola.services.ClasseService;
import com.example.scuola.entity.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClasseController {

    @Autowired
    private ClasseService classeService;

    @GetMapping("/classi")
    public List<Classe> getClassi() {return classeService.getClassi();}

    @GetMapping("/classi/{id}")
    public Classe getClasse(@PathVariable Integer id) {return classeService.getClasse(id);}

    @PostMapping("/classi")
    public void addClasse(@RequestBody Classe classe) {classeService.addClasse(classe);}

    @PutMapping("/classi/{id}")
    public void updateClasse(@PathVariable Integer id, @RequestBody Classe classe) {
        classeService.updateClasse(id, classe);
    }

    @DeleteMapping("/classi/{id}")
    public void deleteClasse(@PathVariable Integer id) {classeService.deleteClasse(id);}
}



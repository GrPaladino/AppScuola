package com.example.scuola.controllers;

import com.example.scuola.entity.Classe;
import com.example.scuola.services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClasseController {

    @Autowired
    private ClasseService classeService;

    @GetMapping("/classi")
    public List<Classe> getClassi() {return classeService.getClassi();}

    @GetMapping("/classe/{id}")
    public Classe getClasse(@PathVariable Integer id) {return classeService.getClasse(id);}

    @PostMapping("/classe")
    public void addClasse(@RequestBody Classe classe) {classeService.addClasse(classe);}

    @PutMapping("/classe/{id}")
    public void updateClasse(@PathVariable Integer id, @RequestBody Classe classe) {
        classeService.updateClasse(id, classe);
    }

    @DeleteMapping("/classe/{id}")
    public void deleteClasse(@PathVariable Integer id) {classeService.deleteClasse(id);}
}



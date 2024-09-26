package com.example.scuola.controllers;


import com.example.scuola.entity.Insegnante;
import com.example.scuola.services.InsegnanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InsegnanteController {

    @Autowired
    private InsegnanteService insegnanteService;

    @GetMapping("/insegnanti")
    public List<Insegnante> getInsegnanti() {return insegnanteService.getInsegnanti();}

    @GetMapping("/insegnanti/{id}")
    public Insegnante getInsegnante(@PathVariable Integer id) {return insegnanteService.getInsegnante(id);}

    @PostMapping("/insegnante")
    public void addInsegnante(@RequestBody Insegnante insegnante) {insegnanteService.addInsegnante(insegnante);}

    @PutMapping("/insegnante/{id}")
    public void updateInsegnante(@PathVariable Integer id, @RequestBody Insegnante insegnante) {
        insegnanteService.updateInsegnante(id, insegnante);
    }

    @DeleteMapping("/insegnante/{id}")
    public void deleteInsegnante(@PathVariable Integer id) {insegnanteService.deleteInsegnante(id);}
}

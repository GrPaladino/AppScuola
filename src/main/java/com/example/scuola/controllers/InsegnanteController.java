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

    @PostMapping("/insegnanti")
    public void addInsegnante(@RequestBody Insegnante insegnante) {insegnanteService.addInsegnante(insegnante);}

    @PutMapping("/insegnanti/{id}")
    public void updateInsegnante(@PathVariable Integer id, @RequestBody Insegnante insegnante) {
        insegnanteService.updateInsegnante(id, insegnante);
    }

    @DeleteMapping("/insegnanti/{id}")
    public void deleteInsegnante(@PathVariable Integer id) {insegnanteService.deleteInsegnante(id);}
}

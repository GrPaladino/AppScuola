package com.example.scuola.controllers;

import com.example.scuola.entity.Studente;
import com.example.scuola.services.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudenteController {

    @Autowired
    private StudenteService studenteService;

    @GetMapping("/studenti")
    public List<Studente> getStudenti() {
        return studenteService.getStudenti();
    }

    @GetMapping("/studenti/{id}")
    public Studente getStudente(@PathVariable Integer id) {
        return studenteService.getStudente(id);
    }

    @PostMapping("/studenti")
    public void addStudente(@RequestBody Studente studente) {
        studenteService.addStudente(studente);
    }

    @PutMapping("/studenti/{id}")
    public void updateStudente(@PathVariable Integer id, @RequestBody Studente studente) {
        studenteService.updateStudente(id, studente);
    }

    @DeleteMapping("/studenti/{id}")
    public void deleteStudente(@PathVariable Integer id) {
        studenteService.deleteStudente(id);
    }

}

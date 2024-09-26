package com.example.scuola.studenti.controllers;

import com.example.scuola.studenti.entity.Studente;
import com.example.scuola.studenti.services.StudenteServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudenteController {

    @Autowired
    private StudenteServiceDB studenteService;

    @GetMapping("/studenti")
    public List<Studente> getStudenti() {
        return studenteService.getStudenti();
    }

    @GetMapping("/studente/{id}")
    public Studente getStudente(@PathVariable Integer id) {
        return studenteService.getStudente(id);
    }

    @PostMapping("/studente")
    public void addStudente(@RequestBody Studente studente) {
        studenteService.addStudente(studente);
    }

    @PutMapping("/studente/{id}")
    public void updateStudente(@PathVariable Integer id, @RequestBody Studente studente) {
        studenteService.updateStudente(id, studente);
    }

    @DeleteMapping("/studente/{id}")
    public void deleteStudente(@PathVariable Integer id) {
        studenteService.deleteStudente(id);
    }

}

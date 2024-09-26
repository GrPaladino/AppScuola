package com.example.scuola.services;

import com.example.scuola.entity.Studente;
import com.example.scuola.repository.StudenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudenteService {

    @Autowired
    private StudenteRepository studenteRepository;

    public List<Studente> getStudenti() {
        return studenteRepository.findAll();
    }

    public Studente getStudente(Integer id) {
        Optional<Studente> studente = studenteRepository.findById(id);
        if (studente.isPresent()) {
            return studente.get();
        } else {
            return null;
        }
    }

    public void addStudente(Studente studente) {
    studenteRepository.save(studente);
    }

    public void updateStudente(Integer id, Studente studente) {
        studenteRepository.save(studente);
    }

    public void deleteStudente(Integer id) {
        studenteRepository.deleteById(id);
    }
}

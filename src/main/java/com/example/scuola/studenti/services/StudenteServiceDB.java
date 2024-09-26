package com.example.scuola.studenti.services;

import com.example.scuola.models.Studente;
import com.example.scuola.StudenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudenteServiceDB implements StudenteService {

    @Autowired
    private StudenteRepository studenteRepository;

    @Override
    public List<Studente> getStudenti() {
        return studenteRepository.findAll();
    }

    @Override
    public Studente getStudente(Integer id) {
        Optional<Studente> studente = studenteRepository.findById(id);
        if (studente.isPresent()) {
            return studente.get();
        } else {
            return null;
        }
    }

    @Override
    public void addStudente(Studente studente) {
    studenteRepository.save(studente);
    }

    @Override
    public void updateStudente(Integer id, Studente studente) {
        studenteRepository.save(studente);
    }

    @Override
    public void deleteStudente(Integer id) {
        studenteRepository.deleteById(id);
    }
}

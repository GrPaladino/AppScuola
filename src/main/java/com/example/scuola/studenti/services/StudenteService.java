package com.example.scuola.studenti.services;

import com.example.scuola.studenti.entity.Studente;

import java.util.List;

public interface StudenteService {
    public List<Studente> getStudenti();

    public Studente getStudente(Integer id);

    public void addStudente(Studente studente);

    public void updateStudente(Integer id, Studente studente);

    public void deleteStudente(Integer id);
}
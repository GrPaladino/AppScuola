package com.example.scuola.services;

import com.example.scuola.entity.Insegnante;
import com.example.scuola.repository.InsegnanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsegnanteService {

    @Autowired
    private InsegnanteRepository insegnanteRepository;

    public List<Insegnante> getInsegnanti() {
        return insegnanteRepository.findAll();
    }

    public Insegnante getInsegnante(Integer id) {
        Optional<Insegnante> insegnante = insegnanteRepository.findById(id);
        if (insegnante.isPresent()) {
            return insegnante.get();
        } else {
            return null;
        }
    }

    public void addInsegnante(Insegnante insegnante) {insegnanteRepository.save(insegnante);}

    public void updateInsegnante(Integer id, Insegnante insegnante) {
        insegnanteRepository.save(insegnante);
    }

    public void deleteInsegnante(Integer id) {
        insegnanteRepository.deleteById(id);
    }

}

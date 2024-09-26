package com.example.scuola.services;
import com.example.scuola.entity.Classe;
import com.example.scuola.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClasseService {
    @Autowired
    private ClasseRepository classeRepository;

    public List<Classe> getClassi() {
        return classeRepository.findAll();
    }

    public Classe getClasse(Integer id) {
        Optional<Classe> classe = classeRepository.findById(id);
        return classe.orElse(null);
    }

    public void addClasse(Classe classe) {
        classeRepository.save(classe);
    }

    public void updateClasse(Integer id, Classe classe) {
        classeRepository.save(classe);
    }

    public void deleteClasse(Integer id) {
        classeRepository.deleteById(id);
    }
}

package com.example.scuola.studenti.repository;

import com.example.scuola.studenti.entity.Studente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudenteRepository extends JpaRepository<Studente, Integer> {
}

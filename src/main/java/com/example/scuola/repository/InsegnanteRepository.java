package com.example.scuola.repository;

import com.example.scuola.entity.Insegnante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsegnanteRepository extends JpaRepository<Insegnante, Integer> {
}

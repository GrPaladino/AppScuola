package com.example.scuola.studenti.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "studente")
@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Studente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")      // ---> nome della colonna
    private String nome;        // ---> nome della variabile che fa riferimento alla colonna a db

    private String cognome;
    private String genere;
    private String email;

    @ManyToOne
    @JoinColumn(name = "idClassi")
    private Classi classi;

}
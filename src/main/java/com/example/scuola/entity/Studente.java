package com.example.scuola.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "studenti")
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

    @Column(name = "nome", length = 20)
    private String nome;

    @Column(name="cognome", length = 30)
    private String cognome;

    @Column(name="genere")
    private String genere;

    @Column(name="email",length = 100, unique = true, nullable = false)
    private String email;


    @ManyToOne
    @JoinColumn(name = "classeId")
    private Classe classe;


}
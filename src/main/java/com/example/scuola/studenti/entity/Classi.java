package com.example.scuola.studenti.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Entity
@Table(name = "classe")
@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Classi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")
    private Integer grado;

    private String sezione;

    private Integer totAlunni;

    @OneToMany(mappedBy = "studente")
    private ArrayList<Studente> studenti = new ArrayList<>();

}
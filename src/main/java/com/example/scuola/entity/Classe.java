package com.example.scuola.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "classi")
@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "grado", length = 1, nullable = false)
    private Integer grado;

    @Column(name = "sezione", length = 1, nullable = false)
    private String sezione;

    @Column(name = "tot_alunni")
    private Integer totAlunni;


//    oneToMany con studenti
    @OneToMany(mappedBy = "classe")
    private Set<Studente> studenti;

//    manyToMany con insegnanti
    @ManyToMany(mappedBy = "classi")
    private Set<Insegnante> insegnanti;

}
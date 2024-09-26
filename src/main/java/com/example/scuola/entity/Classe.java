package com.example.scuola.entity;

import jakarta.persistence.*;
import lombok.*;

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

//    @OneToMany(mappedBy = "studente")
//    private ArrayList<Studente> studenti = new ArrayList<>();

}
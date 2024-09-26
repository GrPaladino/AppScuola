package com.example.scuola.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "insegnenti")
@ToString
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Insegnante {

    @Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", length = 30)
    private String nome;

    @Column(name = "cognome", length = 30)
    private String cognome;

    @Column(name="genere")
    private String genere;

    @Column(name="email", unique = true, nullable = false)
    private String email;
}

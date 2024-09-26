package com.example.scuola.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import java.util.Objects;


@Entity
@Table(name = "studente")
public class Studente {
    @jakarta.persistence.Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private String cognome;
    private String genere;
    private String email;

    public Studente(){}

    public Studente(Integer id, String nome, String cognome, String genere, String email) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studente studente = (Studente) o;
        return id == studente.id && Objects.equals(nome, studente.nome) && Objects.equals(cognome, studente.cognome) && Objects.equals(genere, studente.genere) && Objects.equals(email, studente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cognome, genere, email);
    }
}

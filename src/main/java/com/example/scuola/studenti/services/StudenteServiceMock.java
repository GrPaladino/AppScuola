//package com.example.scuola.studenti.services;
//
//import com.example.scuola.studenti.entity.Studente;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class StudenteServiceMock {
//    private List<Studente> studenti = new ArrayList<>(Arrays.asList(new Studente(8, "Giacomo", "Puccini", "m", "giacomo@mail.it"), new Studente(9, "Alessia", "Merz", "f", "Alessia@mail.it"), new Studente(10, "Carola", "Paperino", "f", "carola@mail.it")));
//
//    public List<Studente> getStudenti() {
//        return studenti;
//    }
//
//    public Studente getStudente(Integer id) {
//        return studenti.stream().filter(s -> s.getId() == id).findFirst().get();
//    }
//
//    public void addStudente(Studente studente) {
//        studenti.add(studente);
//    }
//
//    public void updateStudente(Integer id, Studente studente) {
//        for (int i = 0; i < studenti.size(); i++) {
//            Studente s = studenti.get(i);
//            if (s.getId() == id)
//                studenti.set(i, studente);
//        }
//    }
//
//    public void deleteStudente(Integer id) {
//        studenti.removeIf(s -> s.getId() == id);
//    }
//}

package com.projetsoacloud.etudiant.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "etudiant")
public class Etudiant extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_naissance")
    private String date_naissance;

    @Column(name = "classe")
    private String classe;

    @Column(name = "sexe")
    private String sexe;

    @Column(name = "email")
    private String email;


    @JsonManagedReference()
    @OneToMany(mappedBy="etudiant", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Resultat> resultats;

    @JsonManagedReference()
    @OneToMany(mappedBy="etudiant", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Resultat> absences;
}

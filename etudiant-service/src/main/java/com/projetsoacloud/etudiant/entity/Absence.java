package com.projetsoacloud.etudiant.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "absence")
public class Absence extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private String date;

    @Column(name = "annee_scolaire")
    private String anneeScolaire;

    @JsonBackReference()
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="etudiant.id", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Etudiant etudiant;
}

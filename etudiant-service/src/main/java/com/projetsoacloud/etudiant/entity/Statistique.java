package com.projetsoacloud.etudiant.entity;

import java.util.Date;

public class Statistique {

    private String critere;
    private Long valeur;
    private Double taux;
    private Date date;

    public Statistique(String critere, Long valeur) {
        this.critere = critere;
        this.valeur  = valeur;
    }

    public Statistique(String critere, Double moyenne) {
        this.critere = critere;
        this.taux  = moyenne;
    }

    public Statistique(Date date, Long valeur) {
        this.date = date;
        this.valeur  = valeur;
    }

    public String getCritere() {
        return critere;
    }

    public void setCritere(String critere) {
        this.critere = critere;
    }

    public Long getValeur() {
        return valeur;
    }

    public void setValeur(Long valeur) {
        this.valeur = valeur;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
package com.company;

import com.company.Adresse;

public abstract class Personne {
    private String nom;
    private String prenom;
    private Adresse adresse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "{\n" +
                "nom = " + nom + '\n' +
                "prenom = " + prenom + '\n' +
                "adresse = " + adresse + "\n}";
    }
}

package com.company.Logic;

import com.company.data.Fichier;

public abstract class Personne extends Fichier {

    private int id;
    private String nom;
    private String prenom;
    private Adresse adresse;

    public Personne(String nom, String prenom, Adresse adresse) {
        super("src/com/company/db/client.txt");
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public int getId() {
        return getLastLineId()+1;
    }

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
    public void ecrire(String phrase) {
        super.ecrire(adresse.getLastLineId() + " : nom : " + nom + ", prenom/" + prenom + ", Adresse/" + adresse.getLastLineId() + "\n");
    }

    @Override
    public void lire() {
        super.lire();
    }

    @Override
    public String toString() {
        return "{\n" +
                "nom = " + nom + '\n' +
                "prenom = " + prenom + '\n' +
                "adresse = " + adresse + "\n}";
    }
}

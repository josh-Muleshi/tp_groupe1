package com.company;

import com.company.data.Fichier;

public class Adresse extends Fichier {

    private int id;
    private String avenue;
    private String numero;
    private String cellule;
    private String quartier;
    private String commune;
    private String ville;
    private String pays;

    public Adresse(){}

    public Adresse(String avenue, String numero, String cellule, String quartier, String commune, String ville, String pays) {
        super("src/com/company/db/adresse.txt");
        this.avenue = avenue;
        this.numero = numero;
        this.cellule = cellule;
        this.quartier = quartier;
        this.commune = commune;
        this.ville = ville;
        this.pays = pays;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCellule() {
        return cellule;
    }

    public void setCellule(String cellule) {
        this.cellule = cellule;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public void ecrire(String phrase) {
        super.ecrire(getLastLineId()+1 + " : av/" + avenue + ", N/" + numero + ", cellule/" + cellule + ", quartier/" + quartier + ", commune/" +
                    commune + ", Ville/" + ville + ", pays/" + pays + "\n");

    }

    @Override
    public void lire() {
        super.lire();
    }

    @Override
    public String toString() {
        return "{\n" +
                "avenue = " + avenue + '\n' +
                " numero = " + numero + '\n' +
                " cellule = " + cellule + '\n' +
                " quartier = " + quartier + '\n' +
                " commune = " + commune + '\n' +
                " ville = " + ville + '\n' +
                " pays = " + pays + " }";
    }
}

package com.company;

import com.company.data.Fichier;

public class Ligne extends Fichier {
    private int numero;
    private int quantite;
    private Produit produit;

    public Ligne(int numero, int quantite, Produit produit) {
        super("src/com/company/db/lignes.txt");
        this.numero = numero;
        this.quantite = quantite;
        this.produit = produit;
    }

    public Double getPrixTotal(){
        return quantite * produit.getPrix();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public void ecrire(String phrase) {
        super.ecrire( produit.getLastLineId() + " , Numero : " + numero + ", designation : " + quantite
                + "produit : " + produit.getLastLineId() + "\n");
    }

    @Override
    public void lire() {
        super.lire();
    }

    @Override
    public String toString() {
        return " {" +
                " numero = " + numero +
                " quantite = " + quantite +
                " produit = " + produit +
                " \n}";
    }
}

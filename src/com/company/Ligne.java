package com.company;

public class Ligne {
    private int numero;
    private int quantite;
    private Produit produit;

    public Double getPrixTotal(){
        return quantite * produit.getPrix();
    }
}

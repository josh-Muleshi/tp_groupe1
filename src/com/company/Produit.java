package com.company;

import javax.xml.crypto.Data;

public class Produit<T> {
    private String code;
    private String dessignation;
    private Double prix;
    private T uniteMessure;
    private Data dateExpiration;
    private Categorie categorie;

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}

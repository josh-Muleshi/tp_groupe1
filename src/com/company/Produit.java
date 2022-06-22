package com.company;

import java.util.Date;

public class Produit<T> {
    private String code;
    private String dessignation;
    private Double prix;
    private T uniteMessure;
    private Date dateExpiration;
    private Categorie categorie;

    public Produit(String code, String dessignation, Double prix, T uniteMessure, Date dateExpiration, Categorie categorie) {
        this.code = code;
        this.dessignation = dessignation;
        this.prix = prix;
        this.uniteMessure = uniteMessure;
        this.dateExpiration = dateExpiration;
        this.categorie = categorie;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDessignation() {
        return dessignation;
    }

    public void setDessignation(String dessignation) {
        this.dessignation = dessignation;
    }

    public T getUniteMessure() {
        return uniteMessure;
    }

    public void setUniteMessure(T uniteMessure) {
        this.uniteMessure = uniteMessure;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "{ \n\t\t" +
                "code = " + code + "\n\t\t" +
                "dessignation = " + dessignation + "\n\t\t" +
                "prix = " + prix + "\n\t\t" +
                "uniteMessure = " + uniteMessure + "\n\t\t" +
                "dateExpiration = " + dateExpiration + "\n\t\t" +
                "categorie = " + categorie + "\n" +
                "\t\t}";
    }
}

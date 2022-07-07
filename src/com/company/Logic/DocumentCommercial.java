package com.company.Logic;

import com.company.data.Fichier;

public abstract class DocumentCommercial extends Fichier {
    private Long numero;
    private  Client client;
    private Detail detail;

    public DocumentCommercial(){
        super("src/com/company/db/facture.txt");
    }

    public abstract double getTotal();
    public abstract double getTva();

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    @Override
    public void ecrire(String phrase) {
        super.ecrire( client.getLastLineId() + " , numero" + numero + " , clien" + client.getLastLineId() + " , detail" + detail.getLastLineId() + "\n");
    }

    @Override
    public void lire() {
        super.lire();
    }

    @Override
    public String toString() {
        return "numero = " + numero +
                ",\nclient = " + client +
                ",\ndetail = " + detail;
    }
}

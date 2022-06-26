package com.company;

public abstract class DocumentCommercial {
    private Long numero;
    private  Client client;
    private Detail detail;

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
    public String toString() {
        return "numero = " + numero +
                ",\nclient = " + client +
                ",\ndetail = " + detail;
    }
}

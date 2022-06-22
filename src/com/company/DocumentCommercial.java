package com.company;

public abstract class DocumentCommercial {
    private Long numero;
    private  Client client;
    private Detail detail;

    public abstract Double getTotal();
    public abstract Double getTva();
}

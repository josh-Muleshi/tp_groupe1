package com.company;

import java.util.List;

public class Facture extends DocumentCommercial {
    @Override
    public double getTotal() {
        double total = 0;
        Detail detail = getDetail();
        List<Ligne> l = detail.getLignes();
        for (Ligne s: l) {
            total += s.getPrixTotal();
        }
        return total;
    }
    @Override
    public double getTva() {
        return (getTotal()*16) / 100;
    }
}

package com.company;

import java.util.List;

public class Devis extends DocumentCommercial {
    @Override
    public Double getTotal() {
        double total = 0;
        Detail detail = getDetail();
        List<Ligne> l = detail.getLignes();
        for (Ligne s: l) {
            total += s.getPrixTotal();
        }
        return total;
    }

    @Override
    public Double getTva() {
        return (getTotal()*16) / 100;
    }
}

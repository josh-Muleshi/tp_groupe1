package com.company;

import java.util.List;

public class Detail {
    public List<Ligne> lignes;

    public List<Ligne> getLignes() {
        return lignes;
    }

    public void setLignes(List<Ligne> lignes) {
        this.lignes = lignes;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\tlignes = " + lignes +
                "\t}";
    }
}

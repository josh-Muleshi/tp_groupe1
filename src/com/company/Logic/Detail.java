package com.company.Logic;

import com.company.data.Fichier;

import java.util.List;

public class Detail extends Fichier {
    public List<Ligne> lignes;

    public Detail(){
        super("src/com/company/db/detail.txt");
    }

    public List<Ligne> getLignes() {
        return lignes;
    }

    public void setLignes(List<Ligne> lignes) {
        this.lignes = lignes;
    }

    @Override
    public void ecrire(String phrase) {
//        lignes.forEach(ligne -> {
//            super.ecrire( ligne.getLastLineId() + " , lignes : " + ligne.getLastLineId() + "\n");
//        });

    }

    @Override
    public void lire() {
        super.lire();
    }

    @Override
    public String toString() {
        return "{\n" +
                "\tlignes = " + lignes +
                "\t}";
    }
}

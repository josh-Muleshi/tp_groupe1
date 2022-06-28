package com.company;

import com.company.data.Fichier;

public class Categorie extends Fichier {
    private String designation;
    private String description;

    public Categorie(String designation, String description) {
        super("src/com/company/db/categorie.txt");
        this.designation = designation;
        this.description = description;
    }

    @Override
    public void ecrire(String phrase) {
        super.ecrire( getLastLineId()+1 + " , description : " + description + ", designation : " + designation + "\n");
    }

    @Override
    public void lire() {
        super.lire();
    }

    @Override
    public String toString() {
        return "{ \n\t\t\t\t" +
                "designation = " + designation + "\n\t\t\t\t" +
                "description = " + description + "\n\t\t\t}";
    }
}

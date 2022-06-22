package com.company;

public class Categorie {
    private String designation;
    private String description;

    public Categorie(String designation, String description) {
        this.designation = designation;
        this.description = description;
    }

    @Override
    public String toString() {
        return "{ \n\t\t\t\t" +
                "designation = " + designation + "\n\t\t\t\t" +
                "description = " + description + "\n\t\t\t}";
    }
}

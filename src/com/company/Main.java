package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * GL(SI)
 *
 * Muteba Muleshi Josue
 * Nsamba Kafunda Ornella
 * Kapend Tshek
 *
 * MSI
 *
 * Muteba Mbuyi Fabrice
 * Musonda Molwe Cedrick
 * Mutanga Wa Mulumba Gracia
 * Masudi Nyembo Francis
 * Ramazani Kabobo Lucien
 *
 * @author team
 */

public class Main {

    public static void main(String[] args) {
        Facture facture1 = new Facture();
        Categorie categorie1 = new Categorie("poisson", "nous vendons des poisson fres");

        Client scott = new Client();
        scott.setNom("Musonda");
        scott.setPrenom("Scott");
        scott.setAdresse(new Adresse("kafubu", "N 2", "kamalale", "kafubu", "kampemba", "lushi", "congo"));

        facture1.setNumero(125668854L);
        facture1.setClient(scott);

        Produit<String> tilapia = new Produit<>("18min", "tilapia", 6000.0, "Kilo", new Date(2025), categorie1);

        Ligne ligne1 = new Ligne(2, 3, tilapia);

        List<Ligne> lignes = new ArrayList<>();
        lignes.add(ligne1);

        Detail detail = new Detail();
        detail.setLignes(lignes);

        facture1.setDetail(detail);

        System.out.println(facture1);
    }
}

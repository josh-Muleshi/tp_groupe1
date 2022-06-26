package com.company;

import com.company.data.Fichier;

import java.util.*;

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

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("------------- Facture ---------------");

        System.out.println("Entrez le nom et le prenom du client");
        String nom = scanner.nextLine();
        String prenom = scanner.nextLine();

        System.out.println("Entrez l'adresse du client");
        String avenue = scanner.nextLine();
        String numero = scanner.nextLine();
        String cellule = scanner.nextLine();
        String quartier = scanner.nextLine();
        String commune = scanner.nextLine();
        String ville = scanner.nextLine();
        String pays = scanner.nextLine();

        Client client1 = clientFunc(nom, prenom, new Adresse(avenue, numero, cellule, quartier, commune, ville, pays));

        long numeroFacture = random.nextLong();
        System.out.println(factureFunc(numeroFacture, client1));
    }
    private static Facture factureFunc(long numeroFacture, Client client){
        Facture facture1 = new Facture();
        facture1.setNumero(numeroFacture);
        facture1.setClient(client);

        System.out.println("Entrez la categorie du produit");
        String designationCat = scanner.nextLine();
        String description = scanner.nextLine();

        Categorie categorie1 = new Categorie(designationCat, description);

        System.out.println("Entrez les Produits du produit");
        String code = scanner.nextLine();
        String descriptionPro = scanner.nextLine();
        double prix = scanner.nextDouble();
        String uniteMessure = scanner.nextLine();

        Produit<String> produit1 = produitFunc(code, descriptionPro, prix, uniteMessure, new Date(2025), categorie1);

        System.out.println("Entrez les lignes du produit");
        int num = scanner.nextInt();
        int qte = scanner.nextInt();
        List<Ligne> lignes = lignesFunc(num, qte, produit1);

        facture1.setDetail(detailFunc(lignes));
        facture1.getTotal();
        facture1.getTva();

        return facture1;
    }
    private static Client clientFunc(String nom, String prenom, Adresse adresse){
        return new Client(nom, prenom, adresse);
    }
    private static Produit<String> produitFunc(
            String code,
            String designation,
            double prix,
            String uniteMessure,
            Date date,
            Categorie categorie
    ){
        return new Produit<>(code, designation, prix, uniteMessure, date, categorie);
    }
    private static List<Ligne> lignesFunc(int numero, int qte, Produit<String> produit){
        Ligne ligne1 = new Ligne(numero, qte, produit);

        List<Ligne> lignes = new ArrayList<>();
        lignes.add(ligne1);
        return lignes;
    }

    private static Detail detailFunc(List<Ligne> lignes){
        Detail detail = new Detail();
        detail.setLignes(lignes);
        return detail;
    }
}

package com.company.facture;

import com.company.Logic.*;

import java.util.*;

import static com.company.facture.FactureScreen.createFactWindow;

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
        createFactWindow();
        Random random = new Random();

        System.out.println("------------- Facture ---------------");

        System.out.println("Entrez le nom et le prenom du client");
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prenom : ");
        String prenom = scanner.nextLine();

        System.out.println("Entrez l'adresse du client");
        System.out.print("Avenue : ");
        String avenue = scanner.nextLine();
        System.out.print("Numero : ");
        String numero = scanner.nextLine();
        System.out.print("Cellule : ");
        String cellule = scanner.nextLine();
        System.out.print("Quartier : ");
        String quartier = scanner.nextLine();
        System.out.print("Commune : ");
        String commune = scanner.nextLine();
        System.out.print("Ville : ");
        String ville = scanner.nextLine();
        System.out.print("Pays : ");
        String pays = scanner.nextLine();

        Adresse adresse = new Adresse(avenue, numero, cellule, quartier, commune, ville, pays);
        adresse.ecrire("");
        Client client1 = clientFunc(nom, prenom, adresse);
        client1.ecrire("");

        long numeroFacture = random.nextLong();
        System.out.println(factureFunc(numeroFacture, client1));
    }
    private static Facture factureFunc(long numeroFacture, Client client){
        Facture facture1 = new Facture();
        facture1.setNumero(numeroFacture);
        facture1.setClient(client);

        System.out.println("Entrez la categorie du produit");
        System.out.print("Designation : ");
        String designationCat = scanner.nextLine();
        System.out.print("Description : ");
        String description = scanner.nextLine();
        Categorie categorie1 = new Categorie(designationCat, description);
        categorie1.ecrire("");

        System.out.println("Entrez le produit");
        System.out.print("Code prod : ");
        String code = scanner.nextLine();
        System.out.print("Nom prod : ");
        String descriptionPro = scanner.nextLine();
        System.out.print("Unite Mesure : ");
        String uniteMesure = scanner.nextLine();
        System.out.print("Prix : ");
        double prix =scanner.nextDouble();
        Produit<String> produit1 = produitFunc(code, descriptionPro, prix, uniteMesure, new Date(2025), categorie1);
        produit1.ecrire("");

        System.out.println("Entrez les lignes du produit");
        System.out.print("Numero ligne : ");
        int num = scanner.nextInt();
        System.out.print("Quatite : ");
        int qte = scanner.nextInt();
        List<Ligne> lignes = lignesFunc(num, qte, produit1);

        facture1.setDetail(detailFunc(lignes));
        facture1.getTotal();
        facture1.getTva();
        facture1.ecrire("");
        facture1.lire();
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
        ligne1.ecrire("");

        List<Ligne> lignes = new ArrayList<>();
        lignes.add(ligne1);
        return lignes;
    }

    private static Detail detailFunc(List<Ligne> lignes){
        Detail detail = new Detail();
        detail.ecrire("");
        detail.setLignes(lignes);
        return detail;
    }
}

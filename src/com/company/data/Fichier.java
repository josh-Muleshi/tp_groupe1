package com.company.data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class Fichier {
    private String chemin;
    private File file;

    BufferedReader br;

    public Fichier(){}

    public Fichier(String chemin) {
        this.chemin = chemin;
        this.file = new File(this.chemin);
    }

    public boolean exist() {
        return this.file.exists();
    }

    public void creer() {
        try {
            if (this.file.createNewFile()) {
                System.out.println("Le fichier a bel et bien été créé");
            } else {
                System.out.println("Erreur lors de la création du fichier");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lire() {
        try {
            Scanner scanner = new Scanner(this.file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ecrire(String phrase) {
        try {
            FileWriter fileWriter = new FileWriter(this.chemin, true);
            fileWriter.append(phrase);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isEmpty;

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public int getLastLineId() {
        String lastLine = "";
        int id = 0;
        try {
            String sCurrentLine;

            BufferedReader br = new BufferedReader(new FileReader(chemin));
            while ((sCurrentLine = br.readLine()) != null)
            {
                System.out.println(sCurrentLine);
                lastLine = sCurrentLine;
            }
            if (!lastLine.equals("")){
                String[] tabLines = lastLine.split(" ");
                id = Integer.parseInt(tabLines[0]);
                isEmpty = false;
            }else {
                isEmpty = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return id;
    }

    @Override
    public String toString() {
        return "Le chemin d'accès à votre fichier est " + this.getChemin();
    }
}
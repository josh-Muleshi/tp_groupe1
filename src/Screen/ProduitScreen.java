package Screen;

import com.company.Logic.Produit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;

public class ProduitScreen {
    private JPanel panel1;
    private JTextField id;
    private JTextField code;
    private JTextField designation;
    private JTextField prix;
    private JTextField unite;
    private JButton Ajouter;
    private JButton Modifier;
    private JButton Supprimer;

    public ProduitScreen() {
        Ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ajouter();
            }
        });
        Modifier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Supprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                supprimer(Integer.parseInt(id.getText()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ProduitScreen");
        frame.setContentPane(new ProduitScreen().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(700, 300);
    }

    private Connection connexion(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturation", "root", "");


            return connection;

        } catch (SQLException e) {
            System.err.println("impossible de se connecter");
        }
        return null;
    }

    private void ajouter(){
        Produit<String> produit = new Produit<>();
        produit.setCode(code.getText());
        produit.setDessignation(designation.getText());
        produit.setPrix(Double.parseDouble(prix.getText()));
        produit.setUniteMessure(unite.getText());
        produit.setDateExpiration(Date.valueOf(LocalDate.now()));

        try {
            Statement monInstruction = connexion().createStatement();
            String requete = "INSERT INTO product(code, designation, prix, unite, date) value ('"+ produit.getCode() +"','"+ produit.getDessignation() +"','"+ produit.getPrix() +"'," +
                    "'"+ produit.getUniteMessure() +"','"+produit.getDateExpiration()+"');";
            monInstruction.executeUpdate(requete);
            connexion().close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println("impossible de se connecter");
        }
    }

    private void supprimer(int id){
        try {
            Statement monInstruction = connexion().createStatement();
            String requete = "DELETE from product where id = '"+ id +"'";
            monInstruction.executeUpdate(requete);
            connexion().close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println("impossible de se connecter");
        }
    }

}

package com.company.facture;

import Calculatrice.view.CalculatorScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FactureScreen extends JFrame implements ActionListener {

    public FactureScreen(){}

    public static void createFactWindow() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    private static void createUI(JFrame frame) {
        JPanel panel = new JPanel();
        FactureScreen facture = new FactureScreen();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);

        JLabel jLabel = new JLabel("Client");

        JTextField inputBox = new JTextField("Nom",10);
        inputBox.setEditable(false);

        JButton btn_yes = new JButton("valider");
        JButton btn_cancel = new JButton("Annuler");

        btn_yes.addActionListener(facture);
        btn_cancel.addActionListener(facture);

        jLabel.setBounds(20,20,260,30);
        inputBox.setBounds(20,20,260,30);
        btn_yes.setBounds(20,70,50,40);
        btn_cancel.setBounds(20,70,50,40);
        frame.add(jLabel);
        frame.add(inputBox);
        frame.add(btn_yes);
        frame.add(btn_cancel);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

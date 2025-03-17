package com.roberto.ufpb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame {

    public Gui() {
        setTitle("Calculadora");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());



        JPanel visor = new JPanel(new FlowLayout(FlowLayout.CENTER));
        visor.setPreferredSize(new Dimension(0, 70));
        visor.setBackground(Color.RED);
        add(visor, BorderLayout.NORTH);

        JLabel textVisor = new JLabel("C4T0.2");
        textVisor.setFont(new Font( "Arial", Font.BOLD, 50));
        visor.add(textVisor);



        // Painel para os botões
        JPanel painelBotoes = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Lista de botões
        String[][] numeros = {
            {"7", "8", "9", "+"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "/"},
            {"0", "%", "x", "="}
        };

        // Adiciona os botões numéricos
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                gbc.gridx = j;
                gbc.gridy = i;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                Button botao = new Button(numeros[i][j]);

                painelBotoes.add(botao, gbc);
            }
        }



        // Adiciona o painel de botões abaixo do visor
        add(painelBotoes, BorderLayout.CENTER);

        setVisible(true);
    }

}

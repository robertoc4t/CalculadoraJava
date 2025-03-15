package com.roberto.ufpb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame {

    public Gui() {
        setTitle("Calculadora");
        setSize(335, 470);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());



        JPanel visor = new JPanel(new FlowLayout(FlowLayout.CENTER));
        visor.setPreferredSize(new Dimension(0, 70));
        visor.setBackground(Color.RED);
        add(visor, BorderLayout.NORTH);

        JLabel textVisor = new JLabel("C4T0.2");
        textVisor.setFont(new Font( "Arial", Font.BOLD, 30) {
        });;
        visor.add(textVisor);



        // Painel para os botões
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Button n1 = new Button(1);      
        painelBotoes.add(n1);

        Button n2 = new Button(2);
        painelBotoes.add(n2);

        Button n3 = new Button(3);
        painelBotoes.add(n3);

        Button n4 = new Button(4);
        painelBotoes.add(n4);

        Button n5 = new Button(5);
        painelBotoes.add(n5);

        Button n6 = new Button(6);
        painelBotoes.add(n6);

        Button n7 = new Button(7);
        painelBotoes.add(n7);

        Button n8 = new Button(8);
        painelBotoes.add(n8);

        Button n9 = new Button(9);
        painelBotoes.add(n9);

        Button n0 = new Button(0);
        n0.setDimension(310, 70);
        painelBotoes.add(n0);



        // Adiciona o painel de botões abaixo do visor
        add(painelBotoes, BorderLayout.CENTER);

        setVisible(true);
    }

}

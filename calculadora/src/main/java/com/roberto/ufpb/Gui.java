package com.roberto.ufpb;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame{

    public Gui(){
        setTitle("Calculadora");
        setSize(350, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        
        setLayout(new BorderLayout());



        JPanel visor = new JPanel();
        visor.setPreferredSize(new java.awt.Dimension(350, 70));
        visor.setBackground(Color.BLUE);
        visor.setVisible(true);
        add(visor, BorderLayout.NORTH);

        Button n1 = new Button(1);
        add(n1, BorderLayout.SOUTH);
    }
    
}

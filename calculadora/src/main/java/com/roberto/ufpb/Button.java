package com.roberto.ufpb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton implements ActionListener{
    private int value;
    private String valueString;

    
    public Button(String numeros){

        setPreferredSize(new Dimension(100, 50));
        setVisible(true);
        setBackground(Color.BLACK);
        setText(String.valueOf(numeros));
        setBackground(Color.white);
        try {
            // Tenta converter a string para um número inteiro
            this.value = Integer.parseInt(numeros);
        } catch (NumberFormatException e) {
            
        }

        addActionListener(this);
    }
    

    public void setDimension(int a, int b){
        setPreferredSize(new Dimension(a, b));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Ação a ser executada quando o botão for clicado
        System.out.println("Botão com valor " + value + " foi clicado.");
        // Implementar a lógica desejada aqui
    }
        

    
}

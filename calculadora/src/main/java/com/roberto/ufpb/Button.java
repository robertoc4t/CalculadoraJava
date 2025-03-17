package com.roberto.ufpb;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Button extends JButton{
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
    }
    

    public void setDimension(int a, int b){
        setPreferredSize(new Dimension(a, b));
    }


}

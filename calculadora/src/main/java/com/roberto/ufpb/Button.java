package com.roberto.ufpb;

import java.awt.Color;

import javax.swing.JButton;

public class Button extends JButton{
    private int value;
    
    public Button(int value){

        setSize(10,10);
        setVisible(true);
        setBackground(Color.BLACK);

        this.value = value;
    }
}

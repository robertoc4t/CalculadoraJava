package com.roberto.ufpb;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Button extends JButton{
    private int value;

    
    public Button(int value){

        setPreferredSize(new Dimension(100, 50));
        setVisible(true);
        setBackground(Color.BLACK);
        setText(String.valueOf(value));
        setBackground(Color.white);

        this.value = value;
    }

    public void setDimension(int a, int b){
        setPreferredSize(new Dimension(a, b));
    }


}

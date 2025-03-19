package com.roberto.ufpb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListene;
import javax.swing.JButton;

public class Button extends JButton implements ActionListener{
    private int value;
    private String valueString;
    private Mananger m;

    
    public Button(String numeros){

        setPreferredSize(new Dimension(100, 50));
        setVisible(true);
        setBackground(Color.BLACK);
        setText(String.valueOf(numeros));
        setBackground(Color.white);
        valueString = numeros;

        boolean notIsEquals = true;
    while(notIsEquals){
        

        notIsEquals = false;
    }

        
    }
    

    public void setDimension(int a, int b){
        setPreferredSize(new Dimension(a, b));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Ação a ser executada quando o botão for clicado
        valueString = valueString;
        System.out.println(valueString);
        if(valueString == "="){
            resultado();
        }
        
        getValue();
        
    }
    public boolean getValue(){
        return valueString.matches("[0-9]+");
    }

    public int  calcular(){
        return m.actionCalculate(valueString);

    }

    public float resultado(){

    }
}


    

    
}

package com.roberto.ufpb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton implements ActionListener {
    private String valueString;

    public Button(String numeros) {
        setPreferredSize(new Dimension(100, 50));
        setBackground(Color.WHITE);
        setText(numeros);
        this.valueString = numeros;

        // Adiciona o ActionListener para capturar cliques
        this.addActionListener(this);
    }

    public void setDimension(int a, int b) {
        setPreferredSize(new Dimension(a, b));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Captura e imprime qual botão foi clicado
        System.out.println("Botão clicado: " + valueString);
    }

    public boolean isNumeric() {
        return valueString.matches("[0-9]+");
    }

    public void addActionListener(BotaoListener botaoListener) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addActionListener'");
    }
}
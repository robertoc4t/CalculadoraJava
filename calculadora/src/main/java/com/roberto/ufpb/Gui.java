package com.roberto.ufpb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame {
    private JLabel textVisor;
    private String[][] matrizValores = new String[4][4]; // Matriz para armazenar os valores dos botões
    private int currentRow = 0, currentCol = 0; // Controle da posição na matriz

    public Gui() {
        setTitle("Calculadora");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Visor
        JPanel visor = new JPanel(new FlowLayout(FlowLayout.CENTER));
        visor.setPreferredSize(new Dimension(0, 70));
        visor.setBackground(Color.RED);
        add(visor, BorderLayout.NORTH);

        textVisor = new JLabel("");
        textVisor.setFont(new Font("Arial", Font.BOLD, 50));
        visor.add(textVisor);

        // Painel de botões
        JPanel painelBotoes = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Matriz de botões
        String[][] numeros = {
            {"7", "8", "9", "+"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "/"},
            {"0", "%", "x", "="}
        };

        // Criando botões e adicionando ao painel
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                gbc.gridx = j;
                gbc.gridy = i;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;

                Button botao = new Button(numeros[i][j]);
                botao.addActionListener(new BotaoListener(i, j)); // Listener para capturar os cliques
                painelBotoes.add(botao, gbc);
            }
        }
        
        private class BotaoListener implements ActionListener {
            private int row, col;
    
            public BotaoListener(int row, int col) {
                this.row = row;
                this.col = col;
            }
    
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton botaoClicado = (JButton) e.getSource();
                String valor = botaoClicado.getText();
    
                // Adiciona o valor na matriz
                matrizValores[row][col] = valor;
    
                // Atualiza o visor com os botões pressionados
                textVisor.setText(textVisor.getText() + valor);
                
                System.out.println("Botão clicado: " + valor);
            }
        }

        add(painelBotoes, BorderLayout.CENTER);
        setVisible(true);
    }


}
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
    private Mananger manager; // Instância da classe Manager para calcular
    private String currentInput = ""; // Para armazenar o input atual que está sendo exibido no visor

    public Gui() {
        manager = new Mananger(); // Instancia o Manager para lidar com os cálculos
        
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
            {"C", "0", "=", "x"}
        };

        // Criando botões e adicionando ao painel
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                gbc.gridx = j;
                gbc.gridy = i;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;

                JButton botao = new JButton(numeros[i][j]);
                botao.addActionListener(new BotaoListener(numeros[i][j])); // Listener para capturar os cliques
                painelBotoes.add(botao, gbc);
            }
        }

        add(painelBotoes, BorderLayout.CENTER);
        setVisible(true);
    }

    // BotaoListener fora do método construtor
    public class BotaoListener implements ActionListener {
        private String valor;

        public BotaoListener(String valor) {
            this.valor = valor;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (valor.equals("=")) {
                // Se o botão pressionado for '=', calcula e exibe o resultado
                String resultado = manager.actionCalculate(currentInput); // Chama a lógica do cálculo
                textVisor.setText(resultado); // Exibe o resultado no visor
                currentInput = ""; // Limpa o input atual
            } else if (valor.equals("C")) {
                // Se o botão pressionado for 'C', limpa o visor
                currentInput = "";
                textVisor.setText("");
            } else {
                // Adiciona o valor ao input atual e exibe no visor
                currentInput += valor;
                textVisor.setText(currentInput);
            }
        }
    }
}
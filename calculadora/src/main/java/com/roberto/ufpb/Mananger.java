package com.roberto.ufpb;

import java.util.ArrayList;

public class Mananger {
    private ArrayList<String> lista; // Lista para armazenar os valores e operadores
    private int total; // Resultado da operação atual

    public Mananger() {
        lista = new ArrayList<>();
        total = 0;
    }

    // Método para processar o clique no botão
    public String actionCalculate(String input) {
        // Limpa a lista antes de processar o novo input
        lista.clear();

        // Divide o input em partes (número, operador, número)
        String[] partes = input.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        for (String parte : partes) {
            lista.add(parte);
        }

        // Verifica se a lista tem exatamente 3 elementos (número, operador, número)
        if (lista.size() != 3) {
            return "Erro: Formato inválido.";
        }

        // Calcula o resultado
        return calcularResultado();
    }

    // Método para calcular o resultado da lista
    private String calcularResultado() {
        // Convertendo os valores de String para int
        int primeiroValor = Integer.parseInt(lista.get(0));
        int segundoValor = Integer.parseInt(lista.get(2));
        String operador = lista.get(1);

        // Calculando o resultado
        switch (operador) {
            case "+":
                total = primeiroValor + segundoValor;
                break;
            case "-":
                total = primeiroValor - segundoValor;
                break;
            case "/":
                if (segundoValor == 0) {
                    return "Erro: Divisão por zero não permitida.";
                }
                total = primeiroValor / segundoValor;
                break;
            case "x":
            case "*":
                total = primeiroValor * segundoValor;
                break;
            default:
                return "Erro: Operador inválido.";
        }

        // Exibindo o resultado
        return String.valueOf(total); // Retorna o resultado como string
    }

    // Método para retornar o total calculado
    public int getTotal() {
        return total;
    }
}
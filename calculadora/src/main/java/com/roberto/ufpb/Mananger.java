package com.roberto.ufpb;

import java.util.ArrayList;

public class Mananger {
    private int value1;
    private String valueOperation;
    private int total = 0;
    private ArrayList<String> lista;
    
    public Mananger(String valueOp){
        
        this.valueOperation = valueOp;
        

    }

    


    

    public class CalculadoraLista {

    public int actionCalculate(String value) {
        // Verifica se o valor inserido é um número (usando regex)
        if (value.matches("[0-9]+")) {
            lista.add(value); // Adiciona número na lista
            return 0; // Apenas retorna 0, pois ainda não há cálculo a ser feito
        } else {
            // Se não for número, assume que é um operador e chama o cálculo
            lista.add(value);

            if (lista.size() == 3) { // Só faz o cálculo quando tiver 3 elementos (num, op, num)
                int resultado = calcularValorLista();
                lista.clear(); // Limpa a lista após a operação para reiniciar
                lista.add(String.valueOf(resultado)); // Adiciona o resultado como novo ponto de partida
                return resultado;
            }

            return 0; // Retorna 0 se ainda não houver 3 elementos
        }
    }

    public int calcularValorLista() {
        if (lista.size() != 3) {
            throw new IllegalArgumentException("A lista deve conter exatamente 3 elementos.");
        }

        // Convertendo os valores corretamente
        int primeiroValor = Integer.parseInt(lista.get(0)); // Convertendo de String para int
        int segundoValor = Integer.parseInt(lista.get(2)); // Convertendo de String para int
        String operador = lista.get(1); // Pegando o operador corretamente

        // Inicializando o resultado
        int total;

        // Verificando qual operação realizar
        switch (operador) {
            case "+":
                total = primeiroValor + segundoValor;
                break;
            case "-":
                total = primeiroValor - segundoValor;
                break;
            case "/":
                if (segundoValor == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                }
                total = primeiroValor / segundoValor;
                break;
            case "x":
            case "*":
                total = primeiroValor * segundoValor;
                break;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }

        return total;
    }


    }
    

}

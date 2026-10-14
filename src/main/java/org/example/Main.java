package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exercício 1: Vendas da semana
        //Leia o faturamento dos 7 dias da semana. Mostre o total, a média
        //diária e o dia que mais vendeu

        Scanner sc = new Scanner(System.in);

        double[] vendas = new double[7];
        String[] diaSemana = new String[]{"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};

        double total = 0;
        double mairVenda = 0;
        int diaMaiorVenda = 0;

        for (int i = 0; i < vendas.length; i++) {
            System.out.println("informe o faturamento da " + diaSemana[i]);
            vendas[i] = sc.nextDouble();
            if (vendas[i] > mairVenda) {
                mairVenda = vendas[i];
                diaMaiorVenda = i;

            }
            total = total + vendas[i];

            System.out.println("O total foi de " + String.format("%.2f", total));
            System.out.println("A media foi de " + String.format("%.2f", total / vendas.length));
            System.out.println("O dia que mais rendeu foi " + diaSemana[diaMaiorVenda]);


        }

    }
}
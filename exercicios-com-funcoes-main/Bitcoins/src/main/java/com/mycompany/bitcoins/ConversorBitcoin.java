/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bitcoins;

/**
 *
 * @author erick
 */
import java.util.Scanner;

public class ConversorBitcoin {
    public static double converterBitcoinParaDolar(double valor) {
        double taxaDeCambio = 1 / 4.81 ; // 1 Bitcoin = 4.81 dólares
        return valor * taxaDeCambio;
    }

    public static double converterBitcoinParaEuro(double valor) {
        double taxaDeCambio = 1 / 5.16; // 1 Bitcoin = 5.16 euros
        return valor * taxaDeCambio;
    }

    public static double converterBitcoinParaLibra(double valor) {
        double taxaDeCambio = 1 / 6.02; // 1 Bitcoin = 6.02 libras
        return valor * taxaDeCambio;
    }

    public static double converterBitcoinParaReal(double valor) {
        double taxaDeCambio = 1 / 141257.01; // 1 Bitcoin = 141257.01 reais
        return valor * taxaDeCambio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valoresEmBitcoin = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor em Bitcoin do produto " + (i + 1) + ": ");
            valoresEmBitcoin[i] = sc.nextDouble();
        }

        System.out.println("Valor convertido em dólares:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Produto " + (i + 1) + ": " + converterBitcoinParaDolar(valoresEmBitcoin[i]));
        }

        System.out.println("Valor convertido em euros:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Produto " + (i + 1) + ": " + converterBitcoinParaEuro(valoresEmBitcoin[i]));
        }

        System.out.println("Valor convertido em libras:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Produto " + (i + 1) + ": " + converterBitcoinParaLibra(valoresEmBitcoin[i]));
        }

        System.out.println("Valor convertido em reais:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Produto " + (i + 1) + ": " + converterBitcoinParaReal(valoresEmBitcoin[i]));
        }

        sc.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peso;

import java.util.Scanner;

/**
 *
 * @author erick
 */

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Você está com peso normal.");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc < 40) {
            System.out.println("Você está com obesidade.");
        } else {
            System.out.println("Você está com obesidade grave.");
        }

        sc.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeromaiormenor;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class MaiorMenor {
    public static void encontraMaiorMenor() {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = input.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}

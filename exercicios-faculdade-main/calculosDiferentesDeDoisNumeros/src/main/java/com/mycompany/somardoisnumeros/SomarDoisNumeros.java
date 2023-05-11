/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.somardoisnumeros;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SomarDoisNumeros {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.print("Informe o primeiro numero: ");
        numero1 = ler.nextInt();
        
        System.out.print("Informe o segundo numero: ");
        numero2 = ler.nextInt();
        
        //soma = numero1 + numero2;
        
        //System.out.println("A soma dos dois numeros é: " + soma );
        
        System.out.printf("\nResultados:\n");
        System.out.printf("%d + %d = %3d\n", numero1, numero2, (numero1 + numero2));
        System.out.printf("%d + %d = %3d\n", numero1, numero2, (numero1 - numero2));
        System.out.printf("%d + %d = %3d\n", numero1, numero2, (numero1 * numero2));
        System.out.printf("%d / %d = %3d (divisão inteira) \n", numero1, numero2, (numero1 / numero2));
        System.out.printf("%d / %d = %6.2f (divisão inteira) \n", numero1, numero2, ((double) numero1 / numero2));
        
        
    }
}

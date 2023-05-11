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
        
        double numero1, numero2, soma;
        
        System.out.print("Informe o primeiro numero: ");
        numero1 = ler.nextDouble();
        
        System.out.print("Informe o segundo numero: ");
        numero2 = ler.nextDouble();
        
        soma = numero1 + numero2;
        
        System.out.println("A soma dos dois numeros é: " + soma );
    }
}

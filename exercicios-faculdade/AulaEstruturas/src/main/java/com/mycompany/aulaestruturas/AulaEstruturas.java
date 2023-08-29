/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aulaestruturas;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class AulaEstruturas {
    

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
                
        String numeroseCaracteres [] = new String[10];
        int inteiro [] = new int[20];
        double numeros [] = new double[5];
        
        for(int i=0; i<numeroseCaracteres.length;i++){
            System.out.println("Digite um numero ou um caractere: String");
            numeroseCaracteres[i]= ler.nextLine();
               
        }
        System.out.print("Numeros e Caracteres Informados : String");
        for(int i=0; i<numeroseCaracteres.length;i++){
            System.out.print(" - "+numeroseCaracteres[i]);
        }
        
         for(int i=0; i<inteiro.length;i++){
            System.out.println("Digite um numero ou um caractere: Int");
            inteiro[i]= ler.nextInt();
         }
         System.out.print("Numeros e Caracteres Informados : Int");
        for(int i=0; i<inteiro.length;i++){
            System.out.print(" - "+inteiro[i]);
        }
        
        for(int i=0; i<numeros.length;i++){
            System.out.println("Digite um numero ou um caractere: Double");
            numeros[i]= ler.nextInt();
        }
        System.out.print("Numeros e Caracteres Informados : Double");
        for(int i=0; i<numeros.length;i++){
            System.out.print(" - "+numeros[i]);
            
            
        }
    }
}

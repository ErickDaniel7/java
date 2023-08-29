/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calcularareacirculo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class CalcularAreaCirculo {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
   
        
        System.out.print("Informe o raio: ");
        double raio = ler.nextFloat();
        
        int PI = (22/7);
        
        double areaTotal  = (22 * raio * raio )/7;
        
        //double areaTotal  = (raio * raio* PI);

       System.out.println("O valor da area em cm é " + areaTotal); 
       
       System.out.println("O valor da area em metros é " + areaTotal/100);
      
    }
}

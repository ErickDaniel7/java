/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nomepessoagenero;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class NomePessoaGenero {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
   
        
        System.out.println("Informe seu nome: "); 
        String nome = ler.next();
        
        
        System.out.println("Informe seu sexo: " );
        char sexo  = ler.next().charAt(0);
        
        
        System.out.println("Seu nome é: "+nome + " Seu genero é: " +sexo );
        
        
        switch(sexo){
            case 'm':
            System.out.println("Masculino");
            break;
            
            case 'f':
            System.out.println("Feminino");
            break;
            
            case 'g':
            System.out.println("Gay");
            break;
            
            case 'l':
            System.out.println("Lésbica");
            break;

            default:
            System.out.println("Programador");
            break;
        }
        
    }
}

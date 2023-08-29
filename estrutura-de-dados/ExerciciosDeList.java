/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erick
 */
public class ExerciciosDeList {
    List<String> lista = new ArrayList<>(); //Criando a List
    
    public ExerciciosDeList(){
        lista.add("Exemplo1"); //Adicionando elementos a List
        lista.add("Exemplo2");
        lista.add("Exemplo3");        
    }
    
    public void imprimirList(){
        System.out.print("\nExemplo List:\n"+lista);
    }    
}
/*
List é uma interface que permite criar uma coleção
elementos ordenados, a capacidade de aceitar elementos de qualquer tipo e
duplicado é implementado, que é uma estrutura para coleções Java
por outras classes como: ArrayList, Vector e LinkedList. Por exemplo,
Criei uma string de lista com implementação ArrayList e atribuí 3 exemplos.
*/

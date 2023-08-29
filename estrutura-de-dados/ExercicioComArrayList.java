/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class ExercicioComArrayList {       
    ArrayList<String> lista = new ArrayList<>(); // Criando um Arraylist
    
    public ExercicioComArrayList(){ 
        lista.add("Exemplo1"); // Adicionando exemplos ao ArrayList
        lista.add("Exemplo2");
        lista.add("Exemplo3");             
        }
    
    public void ImprimirArrayList(){
        System.out.println("Exemplo ArrayList:\n"+ lista); 
}
}

/*
ArrayList é uma estrutura de dados que pode armazenar e manipular elementos
e pode aumentar ou diminuir de tamanhoconforme a necessidade, ou seja, diferente
do Array que tem um tamanho fixo, o ArrayList é dinâmico. Essa é sua principal
vantagem, sendo útil em situações onde é necessária versatilidade, como quando
uma coleção de elementos precisa ser armazenada dinamicamente. Criei uma lista
de strings como exemplo e adicionei 3 exemplos.
*/ 
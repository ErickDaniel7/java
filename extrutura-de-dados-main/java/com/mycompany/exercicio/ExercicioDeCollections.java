/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author erick
 */
public class ExercicioDeCollections {
     ArrayList<String> nomes = new ArrayList<>();
     
     public ExercicioDeCollections(){
     nomes.add("Robson");
     nomes.add("Davi");
     nomes.add("Rafaela");
     nomes.add("Erick");
     nomes.add("Ricardo");
     nomes.add("Adriela");
     Collections.sort(nomes); // Classifica os elementos em ordem alfabética

     }
     
     public void ImprimirExercicioDeCollections(){
         System.out.println("\nExemplo Colleciton:\n"+nomes);
     }
}
/*
Collections é uma classe utilitária em Java que fornece muitos
Métodos e algoritmos que permitem a manipulação de coleções de forma que
Para que a classificação, filtragem e pesquisa possam ser feitas de alguma forma
prática. Organizei um exemplo onde os nomes aparecem em um ArrayList
Para classificar alfabeticamente, use Collections.sort()
 */
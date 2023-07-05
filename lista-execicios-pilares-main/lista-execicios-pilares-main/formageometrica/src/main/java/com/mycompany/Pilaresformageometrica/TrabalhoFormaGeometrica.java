/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Pilaresformageometrica;

/**
 *
 * @author erick
 */

 //1 -Crie uma classe abstrata chamada "FormaGeometrica" com um método abstrato "calcularArea()". Em seguida crie duas subclasses chamadas "Retangulo"
 //e "Circulo" que herdam da classe "FormaGeometrica" e implementa o método "CalcularArea()" de maneiras diferentes.

public class TrabalhoFormaGeometrica {
  
    public static void main(String[] args) {

        FormaGeometrica forma = new FormaGeometrica();
        Retangulo retangulo = new Retangulo(3, 5);
        Circulo circulo = new Circulo(5, 4);

//        System.out.println(forma.CalcularArea());;
        System.out.println(retangulo.CalcularArea());
        System.out.println(circulo.CalcularArea());
        
    }
    
}

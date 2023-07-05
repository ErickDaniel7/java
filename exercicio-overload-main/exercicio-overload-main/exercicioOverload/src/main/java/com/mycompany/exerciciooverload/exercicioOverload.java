/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciooverload;

/**
 *
 * @author Erick
 */
public class exercicioOverload {

    public static void main(String[] args) {
        calculadora calc = new calculadora();
        
        System.out.println(calc.somar(3, 9));
        
        System.out.println(calc.somar(3.8, 5.8));
        
        int[] vetor = {3, 6, 1, 2, 7, 4, 9};
        System.out.println(calc.somar(vetor));
    }
}
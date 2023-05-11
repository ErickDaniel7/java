/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author aluno
 */
public class Gato extends Animal {
    
    @Override
    public void emitirSom() {
        System.out.println("O gato está  miando");
    }
    
    @Override
    public void mover(){
        System.out.println("O gato está se movendo");
    }
    
}
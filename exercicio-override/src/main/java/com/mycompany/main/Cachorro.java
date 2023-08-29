/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author aluno
 */
public class Cachorro extends Animal {
    
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo");
    }
    
    @Override
    public void mover(){
        System.out.println("O cachorro está se movendo\n");
    }
    
}
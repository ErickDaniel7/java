/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Animal animal = new Cachorro();
        animal.emitirSom();
        animal.mover();
        
        
        animal = new Gato();      
        animal.emitirSom();
        animal.mover();
        
        
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redefinicaometodos;

/**
 *
 * @author Erick
 */
public class RedefinicaoMetodos {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.fazerBarulho();
        
        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();
        
        Gato gato = new Gato();
        gato.fazerBarulho();
        
        animal = new Gato();
        animal.fazerBarulho();
    }
}

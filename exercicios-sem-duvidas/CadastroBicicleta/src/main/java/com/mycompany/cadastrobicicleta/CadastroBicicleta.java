/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrobicicleta;

/**
 *
 * @author Erick
 */
public class CadastroBicicleta {

    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta("Caloi", "Modelo Ultra", "China");
        bike1.setmarchaAro(29, 22);
        bike1.setcorPreco("Preta", 1239.9);
        
        Bicicleta bike2 = new Bicicleta("Sense", "Modelo Padrão", "Marrocos");
        bike2.setmarchaAro(26, 16);
        bike2.setcorPreco("Preta", 889.9);
        
        Bicicleta bike3 = new Bicicleta("Focus", "Modelo Comum", "Inglaterra");
        bike3.setmarchaAro(24, 12);
        bike3.setcorPreco("Preta", 559.5);
        
        Bicicleta bike4 = new Bicicleta("Oggi", "Modelo Ultra", "Brasil");
        bike4.setmarchaAro(29, 22);
        bike4.setcorPreco("Preta", 1669.8);
        
        System.out.println(bike1.getMarca());
        System.out.println(bike1.getInfos());
        System.out.println(bike2.getMarca());
        System.out.println(bike2.getInfos());
        
    }
}

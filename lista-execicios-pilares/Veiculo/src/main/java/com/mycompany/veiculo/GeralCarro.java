/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculo;

/**
 *
 * @author erick
 */

//Crie uma classe chamada "Veiculo" com atributos privados, como "marca" e "ano". Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters. Em seguida, crie uma classe chamada "Carro" que herda da classe "Veiculo" e possui um atributo privado "cor". 
//Utilize encapsulamento para permitir o acesso ao atributo "cor" por meio de métodos getters e setters.

public class GeralCarro {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.setMarcaDoCarro("Mercedes");
        carro.setAno(2021);
        carro.setCor("Chumbo");
        
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());
    }
}

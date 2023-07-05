/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programador;

/**
 *
 * @author erick
 */

//Crie uma classe chamada "Programador" que herda da classe "Funcionario" e possui um atributo privado "linguagem". 
//Utilize encapsulamento para permitir o acesso ao atributo "linguagem" por meio de métodos getters e setters.

public class Linguagem {
    public static void main(String[] args) {
        Programador programador = new Programador();
        programador.setNome("Maria Clara");
        programador.setSalario(3280.0);
        programador.setLinguagem("Java");
        
        System.out.println("Nome: " + programador.getNome());
        System.out.println("Salário: " + programador.getSalario());
        System.out.println("Linguagem: " + programador.getLinguagem());
    }
}

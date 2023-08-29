/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario02;

/**
 *
 * @author erick
 */

//Crie uma classe chamada "Funcionario" com atributos privados, como "nome" e "salario". 
  //Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters.

public class Salario {
    
    public static void main(String[] args) {
        
        Funcionario02 f = new Funcionario02();
        f.setNomeFuncionario("Gabriela");
        f.setSalario(4420.0);
        
        System.out.println("Nome: " + f.getNomeFuncionario());
        System.out.println("Salário: " + f.getSalario());
    }
}
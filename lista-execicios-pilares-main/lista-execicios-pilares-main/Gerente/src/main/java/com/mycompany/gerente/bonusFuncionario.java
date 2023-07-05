/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerente;

/**
 *
 * @author erick
 */

//5 - Crie uma classe chamada gerente que herda da classe Funcionario e possui atributo privado bônus. Utilize o encapsulamento para permitir o acesso ao atributo bonus por meio
// dos métodos Getters & Setters

public class bonusFuncionario {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        
        g.setBonusTotal(167);
        System.out.println("O seu bônus total é: " + g.getBonusTotal());
    }
}

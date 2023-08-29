/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author erick
 */

// 2- Crie uma classe chamada Conta bancária com atributos privados, como saldo e titular. Utilize encapsulamento para permitir o acesso desses atributos por meio
// de metodos getters & setters

    public class Saldo {
        
 public static void main(String[] args) {
  
        ContaBancaria conta1 = new ContaBancaria();
        
        conta1.setSaldo(2500);
        conta1.setTitularDaConta("Fernanda");
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getTitularDaConta());
    }
}

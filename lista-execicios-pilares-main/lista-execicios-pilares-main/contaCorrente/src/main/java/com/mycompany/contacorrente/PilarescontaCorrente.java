/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrente;

/**
 *
 * @author erick
 */

//3 - Crie uma classe chamada ContaCorrente que herda da classe ContaBancaria e possui um método para calcular o valor do cheque especial, disponivel para o titular da conta

public class PilarescontaCorrente {

    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente(3280, "Rafaela");
        
        contaCorrente.calcularValorCheque();
    }
}

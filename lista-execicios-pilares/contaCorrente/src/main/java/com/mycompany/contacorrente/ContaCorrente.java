/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrente;

/**
 *
 * @author erick
 */

public class ContaCorrente extends ContaBancaria{
    
    public ContaCorrente(double saldo, String titularDaConta){
        super(saldo,titularDaConta);
    }
    
    public void calcularValorCheque() {
        double valorMensal = this.getSaldo()/12;
        
        System.out.println("O valor a ser pago por mês será de : " + valorMensal);
    }
    
}

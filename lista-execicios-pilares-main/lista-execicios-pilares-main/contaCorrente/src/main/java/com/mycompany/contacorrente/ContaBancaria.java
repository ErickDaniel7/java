/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contacorrente;

/**
 *
 * @author erick
 */

public class ContaBancaria {
    private double saldo;
    private String titularDaConta;
    
    public ContaBancaria(double saldo, String titularDaConta){
        this.saldo = saldo;
        this.titularDaConta = titularDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobanco;

/**
 *
 * @author aluno
 */
public class ContaEspecial extends ContaBancaria {
    float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (this.getSaldo() - valor < -this.limite) {
            System.out.println("Limite de crédito ultrapassado.");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}

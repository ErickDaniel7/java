/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobanco;

import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaBancaria {
    int dia_rendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int dia_rendimento) {
        super(cliente, num_conta, saldo);
        this.dia_rendimento = dia_rendimento;
    }

    public void calcularNovoSaldo(float taxa_rendimento) {
        int dia_atual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        if (dia_atual == this.dia_rendimento) {
            float novo_saldo = this.getSaldo() * (1 + taxa_rendimento);
            this.setSaldo(novo_saldo);
            System.out.println("Novo saldo: " + novo_saldo);
        } else {
            System.out.println("Hoje não é dia de rendimento.");
        }
    }

    public int getDia_rendimento() {
        return dia_rendimento;
    }

    public void setDia_rendimento(int dia_rendimento) {
        this.dia_rendimento = dia_rendimento;
    }
}

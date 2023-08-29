/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoempregados;

/**
 *
 * @author aluno
 */
public class vendedor extends empregado {

    private float percentualComissao;

    public vendedor(String nome, float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }
    
    // Todos Getters e Setters
    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float calcularSalario() {
        return salario + (salario * percentualComissao / 80);
    }

    public String toString() {
        return "Nome: " + getNome() +
                " - O salário sem comissão é de : " + salario +
                " - O salário com comissão é de : " + calcularSalario() +
                " - O percentual de comissão é de : " + percentualComissao;
    }
}

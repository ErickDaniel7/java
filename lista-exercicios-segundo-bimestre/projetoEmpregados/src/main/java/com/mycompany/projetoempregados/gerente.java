/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoempregados;

/**
 *
 * @author aluno
 */
public class gerente extends empregado {

    private String departamento;

    public gerente(String nome, float salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    
    // Todos Getters e Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String toString() {
        return super.toString() + " - Departamento: " + departamento;
    }

}


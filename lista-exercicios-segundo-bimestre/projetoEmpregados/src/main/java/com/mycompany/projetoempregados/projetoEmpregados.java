/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoempregados;

/**
 *
 * @author aluno
 */
public class projetoEmpregados {

    public static void main(String[] args) {
        empregado empregado = new empregado("Erick", 3270);
        gerente gerente = new gerente("Rafaela", 4430, "Vendas");
        vendedor vendedor = new vendedor("Felipe",  1300, 3);

        System.out.println(empregado);
        System.out.println(gerente);
        System.out.println(vendedor);

        vendedor.setSalario(4900);
        vendedor.setPercentualComissao(8);

        System.out.println("O novo salário do vendedor é de : " + vendedor.getSalario());
        System.out.println("O novo salário com comissão do vendedor é de : " + vendedor.calcularSalario());
        System.out.println(vendedor);
    }
}


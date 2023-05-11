/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cabecalhorelatorio;

/**
 *
 * @author aluno
 */
public class CabecalhoRelatorio {
    public static void main(String[] args) {
        String titulo = "UNIPAR - UNIVERSIDADE PARANAENSE \n" +
"Analise e Desenvolvimento de Sistemas - ADS \n" +
"Algoritmos e Fundamentos de Programação de Computadores \n" +
"Nome: Cássio ";
        gerarCabecalho(titulo);
        // restante do código do relatório...
    }

    public static void gerarCabecalho(String titulo) {
        System.out.println("+-----------------------------------------+");
        System.out.printf("| %34s |%n", titulo);
        System.out.println("+-----------------------------------------+");
    }
}
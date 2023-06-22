/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio07;

/**
 *
 * @author aluno
 */

        interface Pesquisavel {
            void pesquisar(String palavraChave);
    }

        class PesquisaBancoDados implements Pesquisavel {
            
            @Override
                public void pesquisar(String palavraChave) {
       
        System.out.println("Pesquisa chave: " + palavraChave);
        
                }    
        }
        
        public class Exercicio07 {
    public static void main(String[] args) {
        PesquisaBancoDados pesquisaBancoDados = new PesquisaBancoDados();
        
        pesquisaBancoDados.pesquisar("");
        
        pesquisaBancoDados.pesquisar("");
        
        }
    }
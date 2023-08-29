/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio06;

/**
 *
 * @author aluno
 */
        interface Criptografavel{
        void criptografar(String dados);
        void descriptografar(String dadosCriptografados);
    }
        class AESCryptografia implements Criptografavel{
        
        @Override
        public void criptografar(String dados){
            System.out.println(". "+ dados);
        }
        @Override
        public void descriptografar(String dadosCriptografados){
            System.out.println(". " +dadosCriptografados);
            
            }
        }
            
            public class Exercicio06 {
    public static void main(String[] args) {
        AESCryptografia aESCryptografia = new AESCryptografia();
        
        aESCryptografia.criptografar("dados Criptografados");
        
        aESCryptografia.descriptografar("dados descriptografados");
        
        }
    }


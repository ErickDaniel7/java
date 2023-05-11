/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastraradvogado;

/**
 *
 * @author aluno
 */

public class CadastrarAdvogado{

    public static void main(String[] args) {
       Advogados advg1 = new Advogados("Leandro Silva", 48, "Criminal", 40021892, "leandrosilva@gmail.com");         
       Advogados advg2 = new Advogados("Robson Silva", 56, "Civil", 40021892, "robsonsilva@gmail.com");
       Advogados advg3 = new Advogados("Maycon Preslak", 38, "Pequenas Causas", 40021892, "maykonpreslak@gmail.com");
       Advogados advg4 = new Advogados("João Antonio", 40, "Trabalhista", 40021892, "joaoantonio@gmail.com.com");
       Advogados advg5 = new Advogados("Pablo Gabriel", 51, "Criminal", 40021892, "pablogabriel@gmail.com");
       Advogados advg6 = new Advogados("Davi Rigosoto", 52, "Juizados Especiais", 40021892, "davirgs@gmail.com");
       Advogados advg7 = new Advogados("Matheus Davi", 36, "Pequenas Causas", 40021892, "matheusdavi@gmail.com");
       Advogados advg8 = new Advogados("Gabriela Pereira", 46, "Trabalhista", 40021892, "GabrielaPereira@gmail.com");
                
       System.out.println("=--_--=LISTA DE ADVOGADOS=--_--=");
       System.out.println(advg1.getNome());
       System.out.println(advg1.getIdade());
       System.out.println(advg1.getFuncao());
       System.out.println(advg1.getTel());
       System.out.println(advg1.getEmail());
       System.out.println("=-----_-----=");
       
       System.out.println(advg2.getNome());
       System.out.println(advg2.getIdade());
       System.out.println(advg2.getFuncao());
       System.out.println(advg2.getTel());
       System.out.println(advg2.getEmail());
       System.out.println("=-----=-----=");
      
       System.out.println(advg3.getNome());
       System.out.println(advg3.getIdade());
       System.out.println(advg3.getFuncao());
       System.out.println(advg3.getTel());
       System.out.println(advg3.getEmail());
       System.out.println("=-----=-----=");
       
       System.out.println(advg4.getNome());
       System.out.println(advg4.getIdade());
       System.out.println(advg4.getFuncao());
       System.out.println(advg4.getTel());
       System.out.println(advg4.getEmail());
       System.out.println("=-----=-----=");
       
       System.out.println(advg5.getNome());
       System.out.println(advg5.getIdade());
       System.out.println(advg5.getFuncao());
       System.out.println(advg5.getTel());
       System.out.println(advg5.getEmail());
       System.out.println("=-----=-----=");
       
       System.out.println(advg6.getNome());
       System.out.println(advg6.getIdade());
       System.out.println(advg6.getFuncao());
       System.out.println(advg6.getTel());
       System.out.println(advg6.getEmail());
       System.out.println("=-----=-----=");
       
       System.out.println(advg7.getNome());
       System.out.println(advg7.getIdade());
       System.out.println(advg7.getFuncao());
       System.out.println(advg7.getTel());
       System.out.println(advg7.getEmail());
       System.out.println("=-----=-----=");
       
       System.out.println(advg8.getNome());
       System.out.println(advg8.getIdade());
       System.out.println(advg8.getFuncao());
       System.out.println(advg8.getTel());
       System.out.println(advg8.getEmail());
       System.out.println("=-----=-----=");
       
       System.out.println("" + advg6.getNome() + ", " + advg6.getIdade() + ", " + advg6.getFuncao() + ", " + advg6.getTel() + ", " + advg6.getEmail());
       
       System.out.println("" + advg7.getNome() + ", " + advg7.getIdade() + ", " + advg7.getFuncao() + ", " + advg7.getTel() + ", " + advg7.getEmail());
       
       System.out.println("" + advg8.getNome() + ", " + advg8.getIdade() + ", " + advg8.getFuncao() + ", " + advg8.getTel() + ", " + advg8.getEmail());
       
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aluno;

/**
 *
 * @author erick
 */

//Crie uma classe chamada "Aluno" que herda da classe "Pessoa" e possui um atributo privado "matricula". 
//Utilize encapsulamento para permitir o acesso ao atributo "matricula" por meio de métodos getters e setters.

public class DadosMatricula {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNomeAluno("Larissa");
        aluno.setIdade(17);
        aluno.setMatriculaAluno("3031002");
        
        System.out.println("Nome: " + aluno.getNomeAluno());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatriculaAluno());
    }
}
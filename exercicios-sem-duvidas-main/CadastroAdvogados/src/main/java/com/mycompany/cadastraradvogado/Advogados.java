/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastraradvogado;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
class Advogados{

    private String nomeAdvogado;
    private int idadeAdvogado;
    private String funcaoProfissional;
    private int telContato;
    private String emailContato;
    
    public Advogados(String nome, int idade, String funcao, int tel, String email){
        nomeAdvogado = nome;
        idadeAdvogado = idade;    
        funcaoProfissional = funcao;
        telContato = tel;
        emailContato = email;
    }
   
    public String getNome(){
        return "Nome: " + nomeAdvogado;
    }
    public String getIdade(){
        return "Idade: " + idadeAdvogado;
    }
    public String getFuncao(){
        return "funcao: " + funcaoProfissional;
    }
    public String getTel(){
        return "Telefone: " + telContato;
    }
    public String getEmail(){
        return "E-mail: " + emailContato;
    }
}
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author erick
 */

//Crie uma classe chamada "Pessoa" com atributos privados, como "nome" e "idade". 
//Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters.

public class DadosPessoa {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.setNome("Larissa");
        p.setIdadePessoa(18);
        
        System.out.println("Nome: " + p.getNomePessoa());
        System.out.println("Idade: " + p.getIdade());
    }
}
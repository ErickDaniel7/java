/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.construtorcachorro;

/**
 *
 * @author aluno
 */
          class ConstrutorCachorro{
              private final String nomeCachorro;

    public ConstrutorCachorro(String nome) 
    {
         nomeCachorro = nome;
    }
    public String getNome()
    {
        return "Nome do Cachorro " + nomeCachorro; 
    }
}

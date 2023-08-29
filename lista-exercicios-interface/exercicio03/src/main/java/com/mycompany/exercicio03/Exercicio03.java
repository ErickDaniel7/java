/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03;

/**
 *
 * @author aluno
 */

interface Armazenavel {
    
    void salvar(String dados);
    String carregar();
}

class ArquivoCache implements Armazenavel {
    private String dadosArquivo;
    public ArquivoCache(String dadosArquivo) {
        this.dadosArquivo = dadosArquivo;
    }

    @Override
    public void salvar(String dados) {
        
        System.out.println("Salvando dados : " + dadosArquivo);
        System.out.println("Dados: " + dados);
    }

    @Override
    public String carregar() {
        
        System.out.println("Carregando dados: " + dadosArquivo);
        return "Dados carregados";
    }
}

public class Exercicio03 {
    public static void main(String[] args) {
        ArquivoCache arquivoCache = new ArquivoCache("cache.doc");

        arquivoCache.salvar("Dados que sera salvo no arquivo");
        String dadosCarregados = arquivoCache.carregar();

        System.out.println("Dados carregados: " + dadosCarregados);
    }
}

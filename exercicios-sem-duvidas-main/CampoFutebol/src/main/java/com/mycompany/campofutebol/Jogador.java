/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campofutebol;

/**
 *
 * @author erick
 */
public class Jogador {

    private String nome;
    private int idade;
    private String posicaoDoJogador;
    private boolean estaLesionado;
    private String time;
    private boolean cadastrado = false;

    public Jogador(String Nome, int Idade, String Posicao, boolean estaLesionado, String Time, boolean Cadastrado) {
        this.nome = Nome;
        this.idade = Idade;
        this.posicaoDoJogador = Posicao;
        this.estaLesionado = estaLesionado;
        this.time = Time;
        this.cadastrado = Cadastrado;
    }

    public void getNomeIdade() {
        System.out.println("O Jogador: " + nome + " Tem: " + idade + " Anos");
    }

    public void getPosicaoLesao() {
        if (estaLesionado) {
            System.out.println("O Jogador: " + nome + " Joga na Posição: " + posicaoDoJogador + " Está atualmente lesionado");
        } else {
            System.out.println("O Jogador: " + nome + " Joga na Posição: " + posicaoDoJogador + " Está atualmente APTO PARA ENTRAR EM CAMPO");
        }
    }

    public void getTime() {
        System.out.println("O Jogador: " + nome + " Joga no time: " + time);
    }
    
    public boolean Cadastrado(){
        return this.cadastrado;
    }
}

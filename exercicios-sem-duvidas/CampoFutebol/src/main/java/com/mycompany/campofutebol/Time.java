/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campofutebol;

/**
 *
 * @author erick
 */
public class Time {

    private String nome;
    private String pais;
    private String estadio;
    private int jogosSemPerder;
    private Jogador jogador;

    public Time(String aNome, String aPais, String aEstadio, int aJogosSemPerder, Jogador aJogador) {
        this.nome = aNome;
        this.pais = aPais;
        this.estadio = aEstadio;
        this.jogosSemPerder = aJogosSemPerder;
        this.jogador = aJogador;
    }
    public String getNome(){
        return this.nome;
    }
    public int statistica(){
        return this.jogosSemPerder;
    }
}

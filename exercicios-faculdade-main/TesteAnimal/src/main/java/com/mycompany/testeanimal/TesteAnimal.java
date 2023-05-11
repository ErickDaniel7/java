/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeanimal;

/**
 *
 * @author Erick
 */

//Criar uma classe distinguindo 5 atributos para definir um animal. E depois criar uma outra classe para cadastrar 5 animais.

public class TesteAnimal {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.raca = "Dogo Argentino";
        cachorro1.idade = 7;
        cachorro1.peso = 40;
        cachorro1.cor = "Branco";
        cachorro1.porte = "Grande";

        Cachorro cachorro2 = new Cachorro();

        cachorro2.raca = "Pinsher";
        cachorro2.idade = 5;
        cachorro2.peso = 7;
        cachorro2.cor = "Preto";
        cachorro2.porte = "Pequeno";

        Cachorro cachorro3 = new Cachorro();

        cachorro3.raca = "Dobermann";
        cachorro3.idade = 6;
        cachorro3.peso = 25;
        cachorro3.cor = "Preto";
        cachorro3.porte = "Grande";

        Cachorro cachorro4 = new Cachorro();

        cachorro4.raca = "Bull Terrier";
        cachorro4.idade = 4;
        cachorro4.peso = 18;
        cachorro4.cor = "Branco";
        cachorro4.porte = "Medio";

        Cachorro cachorro5 = new Cachorro();

        cachorro5.raca = "Husky Siberiano";
        cachorro5.idade = 6;
        cachorro5.peso = 15;
        cachorro5.cor = "Preto e Branco";
        cachorro5.porte = "Grande";
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desenhavel;

/**
 *
 * @author aluno
 */

interface Desenhavel {
    void desenhar();
}

class Circulo implements Desenhavel {
    @Override
    public void desenhar() {
        System.out.println("círculo");
    }
}

class Retangulo implements Desenhavel {
    
    @Override
    public void desenhar() {
        System.out.println("retângulo");
    }
}

class Triangulo implements Desenhavel {
    
    @Override
    public void desenhar() {
        System.out.println("triângulo");
    }
}

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();

        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
    }
}


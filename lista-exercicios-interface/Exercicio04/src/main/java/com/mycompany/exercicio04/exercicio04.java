/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio04;

/**
 *
 * @author aluno
 */

        interface Redimensionavel {
    void redimensionar(double fator);
}

    class Circulo implements Redimensionavel {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
    }

        public double getRaio() {
            return raio;
    }

        @Override
        public void redimensionar(double fator) {
            raio *= fator;
    }
}

            public class exercicio04 {
                public static void main(String[] args) {
                    Circulo circulo = new Circulo(7.1);
                        System.out.println("Raio do círculo antes dos ajustes: " + circulo.getRaio());

           double redimensionamentoFator = 3.2;
                circulo.redimensionar(redimensionamentoFator);
                    System.out.println("Raio do círculo após as alterações : " + circulo.getRaio());
    }
}



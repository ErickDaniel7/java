/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Pilaresformageometrica;

/**
 *
 * @author erick
 */

public class Circulo extends FormaGeometrica {
        
        double raio;
        double base;

        public Circulo(double raio, int base) {
            this.base = base;
            this.raio = raio;
        }
        
        @Override
        public double CalcularArea(){
            
            double pi = 3.14;
            double raioQuadrado = raio * raio;        
            double areaTotal = (raioQuadrado * pi);           
            return areaTotal;
            
        }
}

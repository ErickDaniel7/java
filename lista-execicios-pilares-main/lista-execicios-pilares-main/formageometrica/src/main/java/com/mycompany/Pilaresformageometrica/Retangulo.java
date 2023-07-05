/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Pilaresformageometrica;

/**
 *
 * @author erick
 */

public class Retangulo extends FormaGeometrica {
        double altura;
        double base;
        public Retangulo(double altura,double base){
            this.altura = altura;
            this.base = base;
            
        }
        
        @Override
        public double CalcularArea(){
            return altura*base;
            
        }
}

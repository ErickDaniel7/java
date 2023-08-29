/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciooverload;

import java.util.Arrays;

/**
 *
 * @author erick
 */

public class calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
    
    public double somar(double a, double b) {
        return a + b;
    }
    
    public int somar(int[] numeros) {
        return Arrays.stream(numeros).sum();
    }
}

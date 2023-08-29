/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inteiropositivonegativo;

/**
 *
 * @author erick
 */
public class VerificaNumero {
    public static int verificaPositivoNegativo(int valor) {
        if (valor > 0) {
            return 1;
        } else if (valor < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

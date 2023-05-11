/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.idade;

/**
 *
 * @author erick
 */
public class CalculaIdade {
    public static int idadeEmDias(int anos, int meses, int dias) {
        int totalDias = (anos * 365) + (meses * 30) + dias;
        return totalDias;
    }
}

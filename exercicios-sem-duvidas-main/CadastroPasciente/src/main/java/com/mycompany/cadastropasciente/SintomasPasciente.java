/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastropasciente;

/**
 *
 * @author Erick
 */
public class SintomasPasciente {
    
    public String sintoma;
    public boolean dorLocalizada;
    public int diasComOsSintoma;
    public double riscoDeInfeccao;
    public char tipoSanguineo;
    

    public SintomasPasciente (String sint, boolean dorLoc, int dias, double risco, char tipoSangue) {
        sintoma = sint;
        dorLocalizada = dorLoc;
        diasComOsSintoma = dias;
        riscoDeInfeccao = risco;
        tipoSanguineo = tipoSangue;
        
    }

    public String getInfoCadastro () {
        return "Sintoma informado: " + sintoma + "\nDor localizada: " + dorLocalizada + "\nDias com sintoma: " + diasComOsSintoma + "\nRisco de infeccao: " + riscoDeInfeccao + "\nTipo sanguíneo: " + tipoSanguineo + "\n";
    }

}

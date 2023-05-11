/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrobicicleta;

/**
 *
 * @author Ferna
 */
public class Bicicleta {
    public String marca;
    public String modelo;
    public String fabricante;
    private double precoBike;
    private String corBike;
    private int tamanhoAro;
    private int quantMarcha;
    
    public void setmarchaAro (int aro, int marcha) {
        tamanhoAro = aro;
        quantMarcha = marcha;
    }
    
    public void setcorPreco (String cor, double preco) {
        corBike = cor;
        precoBike = preco;
    }
    
    public String getInfos () {
        return "Tamanho do aro: " + tamanhoAro + "\nQuantidade de marchas: " + quantMarcha + "\nCor: " + corBike + "\nPreço: " + precoBike + "\n";
    }
    
    public Bicicleta (String mrc, String mdl, String fab) {
        marca = mrc;
        modelo = mdl;
        fabricante = fab;
    }
    
    public String getMarca () {
        return "Informações da Bicicleta\nMarca: " + marca + "\nModelo: " + modelo + "\nFabricante: " + fabricante;
    }

}

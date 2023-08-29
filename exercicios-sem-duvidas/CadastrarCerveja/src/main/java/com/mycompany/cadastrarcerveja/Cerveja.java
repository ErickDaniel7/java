/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastrarcerveja;

/**
 *
 * @author Erick
 */

public class Cerveja {

        public String marca;
        public int qnt;
        public int tipo;
        public int fornecedor;
        private double valordeCompra;
        private double valorVenda;

        public Cerveja(String marca, int quantidade, int tipo, int fornecedor, double valorCompra, double valordaVenda){
            this.marca = marca;
            this.tipo = tipo;
            this.qnt = quantidade;
            this.fornecedor = fornecedor;
            this.valordeCompra = valorCompra;
            this.valorVenda = valordaVenda;
        }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuant() {
        return qnt;
    }

    public void setQuant(int quant) {
        this.qnt = quant;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorCompra() {
        return valordeCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valordeCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public void tipoNome(){
        if(tipo == 0){
            System.out.println("Pilsen");
        }else if(tipo == 1){
            System.out.println("DUPLO MALTE");
        }else if(tipo == 2){
            System.out.println("SEM ÁLCOOL");
        }else if(tipo == 3){
            System.out.println("PURO MALTE");
        }else if(tipo == 4){
            System.out.println("ARTESANAL");
        }else if(tipo == 5){
            System.out.println("MALZBIER");
        }else{
            System.out.println("----------");
        }   
    }
    
    public void fornecedorNome(){
        if(fornecedor == 0){
            System.out.println("Skol");
        }else if (fornecedor == 1){
        System.out.println("Heineken");
        }else{
            System.out.println("OUTROS");
    }
    
    }
    
}

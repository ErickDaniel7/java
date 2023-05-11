/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarcerveja;

/**
 *
 * @author Erick
 */


import java.util.Scanner;

public class CadastrarCerveja {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Cerveja [] cadastrarCerveja = new Cerveja[5];
        
        
        for(int i = 0; i < 5; i++){
            System.out.println("Informe a marca da cerveja: ");
            String marca = ler.next();
            System.out.println("Informe a quantidade de cervejas dessa marca: ");
            int quant = ler.nextInt();
            System.out.println("Informe o tipo utliizando a tabela: ");
            System.out.println("0 - Pilsen");
            System.out.println("1 - Puro Malte");
            System.out.println("2 - Malzbier");
            System.out.println("3 - Dublo Malte");
            System.out.println("4 - Artesanal");
            System.out.println("5 - Sem álcool");
            int tipo = ler.nextInt();
            System.out.println("Informe o fornecedor utilizando a tabela: ");
            System.out.println("0 - AMBEV");
            System.out.println("1 - FEMSA");
            System.out.println("2 - Outros");
            int fornecedor = ler.nextInt();
            System.out.println("Informe o valor de compra: ");
            double valordeCompra = ler.nextDouble();
            System.out.println("Informe o valor de venda: ");
            double valorVenda = ler.nextDouble();
            cadastrarCerveja[i] = new Cerveja(marca, quant, tipo, fornecedor, valordeCompra, valorVenda);
        }
        
        System.out.println("\n\n****Estoque de Carvejas****");
        
        for(int i=0; i<cadastrarCerveja.length ;i++){
            System.out.println("\nnome \t\t"+cadastrarCerveja[i].getMarca());
            System.out.println("quantidade \t"+cadastrarCerveja[i].getQuant());
            System.out.print("tipo \t\t");
            cadastrarCerveja[i].tipoNome();
            System.out.print("fornecedor \t");
            cadastrarCerveja[i].fornecedorNome();
            System.out.println("valor de compra "+cadastrarCerveja[i].getValorCompra());
            System.out.println("valor de venda \t"+cadastrarCerveja[i].getValorVenda());
        }
        
    }
}

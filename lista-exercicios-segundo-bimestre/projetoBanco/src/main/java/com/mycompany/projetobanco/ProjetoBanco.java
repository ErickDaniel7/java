/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetobanco;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ProjetoBanco {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
          ContaBancaria conta1 = new ContaBancaria("Erick", 073, 1800);
    ContaPoupanca conta2 = new ContaPoupanca("Rafaela", 489, 2600, 12);
    ContaEspecial conta3 = new ContaEspecial("Felipe", 129, 3000, 5000);
    
    System.out.println("Informe o número da conta:");
    int num_conta = leitor.nextInt();
    
    if (num_conta == conta1.getNumConta()) {
        System.out.println("Digite o valor que será sacado :");
        float valor = leitor.nextFloat();
        conta1.sacar(valor);
    } else if (num_conta == conta2.getNumConta()) {
        System.out.println("Digite o valor que será sacado :");
        float valor = leitor.nextFloat();
        conta2.sacar(valor);
    } else if (num_conta == conta3.getNumConta()) {
        System.out.println("Digite o valor que será sacado :");
        float valor = leitor.nextFloat();
        conta3.sacar(valor);
    } else {
        System.out.println("Esta conta não foi encontrada .");
    }
    
    System.out.println("Digite o número da conta :");
    num_conta = leitor.nextInt();
    
    if (num_conta == conta1.getNumConta()) {
        System.out.println("Digite o valor que será depositado :");
        float valor = leitor.nextFloat();
        conta1.depositar(valor);
    } else if (num_conta == conta2.getNumConta()) {
        System.out.println("Digite o valor que será depositado :");
        float valor = leitor.nextFloat();
        conta2.depositar(valor);
    } else if (num_conta == conta3.getNumConta()) {
        System.out.println("Digite o valor que será depositado :");
        float valor = leitor.nextFloat();
        conta3.depositar(valor);
    } else {
        System.out.println("Conta não foi encontrada.");
    }
    
    if (conta2 instanceof ContaPoupanca) {
        System.out.println("Digite a taxa de rendimento:");
        float taxa_rendimento = leitor.nextFloat();
        ((ContaPoupanca) conta2).calcularNovoSaldo(taxa_rendimento);
    }
    
    System.out.println("Dados das contas:");
    System.out.println("Cliente: " + conta1.getCliente() + " - Número da conta: " + conta1.getNumConta() + " - Saldo: " + conta1.getSaldo());
    System.out.println("Cliente: " + conta2.getCliente() + " - Número da conta: " + conta2.getNumConta() + " - Saldo: " + conta2.getSaldo() + " - Dia de rendimento: " + ((ContaPoupanca) conta2).dia_rendimento);
    System.out.println("Cliente: " + conta3.getCliente() + " - Número da conta: " + conta3.getNumConta() + " - Saldo: " + conta3.getSaldo() + " - Limite: " + conta3.limite);
}
}

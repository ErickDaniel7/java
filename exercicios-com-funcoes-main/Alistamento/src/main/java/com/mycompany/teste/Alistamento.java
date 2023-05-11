/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;
import java.util.Scanner;

/**
 *
 * @author erick
 */

public class Alistamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pergunta ao usuário a idade e gênero
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();
        System.out.print("Digite o seu gênero (F para feminino ou M para masculino): ");
        char genero = input.next().toUpperCase().charAt(0);

        // Verifica se o usuário pode se alistar
        boolean podeAlistar = false;
        if (genero == 'F' && idade >= 18) {
            System.out.println("Mulheres não precisam se alistar.");
        } else if (genero == 'M' && idade >= 18) {
            podeAlistar = true;
        } else {
            System.out.println("Você ainda não tem idade para se alistar.");
        }

        // Exibe o resultado
        if (podeAlistar) {
            System.out.println("Você pode se alistar.");
        } else {
            System.out.println("Você não pode se alistar.");
        }
    }
}

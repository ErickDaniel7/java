/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio10;

import java.util.Scanner;

/**
 *
 * @author aluno
 */

public class Exercicio10 {
    
    public interface Executavel{
        void executar();
    }
    public class ExecutorComandos implements Executavel{
        
        @Override
        public void executar(){
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite algo: ");
            String resp = ler.nextLine();
            if(resp != null){
               System.out.println(); 
            }
        }
    }
}
    
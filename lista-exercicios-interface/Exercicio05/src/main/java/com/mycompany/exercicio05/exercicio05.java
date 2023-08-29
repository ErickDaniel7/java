/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio05;

/**
 *
 * @author aluno
 */

    interface Registravel {
        void registrar (String msg);
        
    }

    class RegistroConsole implements Registravel {
        
        @Override
        public void registrar (String msg) {
            
            System.out.println("Mensagem do log : " + msg);
        }
    }

    public class exercicio05 {
        public static void main (String[] args) {
            RegistroConsole registroConsole = new RegistroConsole();
            
            registroConsole.registrar ("Mensagem log 01");
            
            registroConsole.registrar ("Mensagem log 02");
    
    }
}

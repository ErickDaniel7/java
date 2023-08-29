/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastropasciente;

/**
 *
 * @author Erick
 */
public class CadastroPasciente {

    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente("Flavio", "095.332.490-72", 25, 72, false);
        System.out.println(paciente1.getInfoClientes());
        SintomasPasciente sintoma1 = new SintomasPasciente("Tosse e dor de garganta", false, 4, 4.5, 'B');
        System.out.println(sintoma1.getInfoCadastro());
        
        
        Paciente paciente2 = new Paciente("Bruno", "411.588.100-32", 35, 78, false);
        System.out.println(paciente2.getInfoClientes());
        SintomasPasciente sintoma2 = new SintomasPasciente("Febre e dor no olho", false, 1, 7, 'B');
        System.out.println(sintoma2.getInfoCadastro());
        
        
        Paciente paciente3 = new Paciente("Gabriel", "892.203.830-63", 13, 45, false);
        System.out.println(paciente3.getInfoClientes());
        SintomasPasciente sintoma3 = new SintomasPasciente("Dor de cabeça", true, 2, 1, 'B');
        System.out.println(sintoma3.getInfoCadastro());
        
        
        Paciente paciente4 = new Paciente("Lorenzo", "023.474.790-08", 15, 55, false);
        System.out.println(paciente4.getInfoClientes());
        SintomasPasciente sintoma4 = new SintomasPasciente("Gripe", true, 4, 10.5, 'O');
        System.out.println(sintoma4.getInfoCadastro());
        
        
        Paciente paciente5 = new Paciente("Rafaela", "739.824.970-51", 18, 55, false);
        System.out.println(paciente5.getInfoClientes());
        SintomasPasciente sintoma5 = new SintomasPasciente("Dor de cabeça e mal estar", true, 15, 3, 'A');
        System.out.println(sintoma5.getInfoCadastro());
        
        
        Paciente paciente6 = new Paciente("Guilherme", "502.662.820-67", 22, 55, false);
        System.out.println(paciente6.getInfoClientes());
        SintomasPasciente sintoma6 = new SintomasPasciente("Dor de barriga", true, 30, 19.8, 'A');
        System.out.println(sintoma6.getInfoCadastro());

    }
}

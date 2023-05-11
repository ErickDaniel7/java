/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastropasciente;

/**
 *
 * @author Erick
 */
public class Paciente {
    
    public String nomedpPaciente;
    public String cpfdoPaciente;
    public int idadedoPaciente;
    public double pesodoPaciente;
    public boolean deficiente;
    
    
    public Paciente (String nome, String cpf, int idade, double peso, boolean defic) {
        nomedpPaciente = nome;
        cpfdoPaciente = cpf;
        idadedoPaciente = idade;
        pesodoPaciente = peso;
        deficiente = defic;
        
    }
    
    public String getInfoClientes () {
        return "Nome do paciente: " + nomedpPaciente + "\nCPF do paciente: " + cpfdoPaciente + "\nIdade do paciente: " + idadedoPaciente + "\nPeso do paciente: " + pesodoPaciente + "\nDeficiente: " + deficiente;
    }
    
}

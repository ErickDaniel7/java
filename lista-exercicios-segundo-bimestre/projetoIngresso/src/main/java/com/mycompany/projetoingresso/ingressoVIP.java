/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoingresso;

/**
 *
 * @author aluno
 */
public class ingressoVIP extends ingresso {
    public float valorAdicional = 20;
    
    public ingressoVIP(float valorIngresso) {
        super(valorIngresso);
        
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public String toString(){
        return "O valor do ingresso VIP é: "+ (valorAdicional + super.getValorIngresso());
    }
    
    
    
}

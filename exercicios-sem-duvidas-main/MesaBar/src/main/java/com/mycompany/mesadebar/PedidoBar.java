/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mesadebar;

/**
 *
 * @author Erick
 */
public class PedidoBar {  
    public String nome;
    public int nMesa;
    public double valor;
    public String pedido;
    public String data;
    
    
     public static void main(String[] args){
         
     PedidoBar pedido1 = new PedidoBar();{
     pedido1.nome = ("luciano");
     pedido1.nMesa = 12;
     pedido1.valor = 90;
     pedido1.pedido = ("xTudo");
     pedido1.data = ("10/05/2031");               
}

     PedidoBar pedido2 = new PedidoBar();{
     pedido2.nome = ("rafael");
     pedido2.nMesa = 43;
     pedido2.valor = 35;
     pedido2.pedido = ("xSalada");
     pedido2.data = ("15/05/3005");
                    
}
     PedidoBar pedido3 = new PedidoBar();{
     pedido3.nome = ("jonathan");
     pedido3.nMesa = 21;
     pedido3.valor = 52;
     pedido3.pedido = ("xBacon");
     pedido3.data = ("31/05/2039");
                    
}
     PedidoBar pedido4 = new PedidoBar();{
     pedido4.nome = ("davi");
     pedido4.nMesa = 47;
     pedido4.valor = 65;
     pedido4.pedido = ("xTilapia");
     pedido4.data = ("09/12/2003");
                    
}
     PedidoBar pedido5 = new PedidoBar();{
     pedido5.nome = ("gabriel");
     pedido5.nMesa = 45;
     pedido5.valor = 53;
     pedido5.pedido = ("xFrango");
     pedido5.data = ("23/09/4003");
    }
     
     double total = pedido1.valor + pedido2.valor + pedido3.valor + pedido4.valor + pedido5.valor;
    
     System.out.println(total);
}
}
package br.com.poo.smd.lista12;

import br.com.poo.smd.lista12.sistema.Controlador;

public class Application {
   public static void main(String[] args) {
       Controlador s = new Controlador();
       s.criarContaBasic(1);
       s.criarContaPlus(2);
       s.criarContaExtreme(3);
       
       for(int i = 1; i<=3; i++) 
    	   s.depositar(i,1000);  
       for(int i = 1; i<=3; i++) 
    	   s.sacar(i,10);  
       
       s.consultar(1);
       s.consultar(2);
       s.consultar(3);
       //Exceção id de conta não existe
       s.consultar(9);
   }
}

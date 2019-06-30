package br.com.poo.smd.lista10;

import java.util.ArrayList;


import br.com.poo.smd.lista10.mainclass.Banco;
import br.com.poo.smd.lista10.subclass.ContaCorrente;
import br.com.poo.smd.lista10.subclass.ContaPoupanca;
import br.com.poo.smd.lista10.superclass.ContaBancaria;



public class Application {

	public static void main(String[] args) {
		
		
		 	ContaCorrente cc = new ContaCorrente(10, 200, 0.50);
			cc.sacar(50);
			System.out.println(cc.getSaldo()); 
			
			ContaPoupanca cp = new ContaPoupanca(2, 500, -100);
			cp.sacar(599);
			ContaPoupanca cp2 = new ContaPoupanca(999, 20000, -1500);
			// Relatorio r = new Relatorio();
			
			/*r.gerarRelatorio(cc);
			r.gerarRelatorio(cp); */
			ArrayList<ContaBancaria>vetorConta = new ArrayList<ContaBancaria>();
			Banco bb = new Banco(vetorConta);
			bb.inserirConta(cc);
			bb.inserirConta(cp);
			bb.inserirConta(cp2);
			bb.mostraDados();
			
			
		
		
		
		
	}

}

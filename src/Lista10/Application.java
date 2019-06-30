package Lista10;

import Lista10.mainclass.Banco;

import java.util.ArrayList;

import Lista10.superclass.ContaBancaria;
import Lista10.subclass.ContaCorrente;
import Lista10.subclass.ContaPoupanca;

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

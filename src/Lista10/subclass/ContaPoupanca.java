package Lista10.subclass;

import Lista10.superclass.ContaBancaria;
import Lista10.util.Imprimivel;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
	private double limite; //Deve ser negativo
	
	public ContaPoupanca(int numeroConta, double saldo,double limite) {
		super(numeroConta, saldo);
		this.limite=limite; //Deve ser passado um valor negativo, para fins didáticos
	}

	@Override
	public void sacar(double valor) {
		if ((getSaldo()-valor) < getLimite()) {
			System.out.println("Ultrapassou o limite");
		} else {
			setSaldo(getSaldo()-valor);
		}	
		
	}

	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo()+valor);	
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void mostraDados() {
		System.out.println("Conta Poupança");
		System.out.println("Numero da Conta:" + numeroConta);
		System.out.println("Saldo:" + saldo);
		System.out.println("Limite:" + (limite *(-1)));
		System.out.println("-------------------------");

	}



	

	
	
}

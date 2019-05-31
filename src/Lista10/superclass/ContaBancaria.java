package Lista10.superclass;

import Lista10.util.Imprimivel;

/* Criar uma classe abstrata conta Bancaria*/
public abstract class ContaBancaria implements Imprimivel{
	protected int numeroConta;
	protected double saldo;
	
	public ContaBancaria(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
	public  void transferir(double valor, ContaBancaria destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}

package Lista10.subclass;

import java.util.Objects;

import Lista10.superclass.ContaBancaria;
import Lista10.util.Imprimivel;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
	private double taxaOperacao;
	
	public ContaCorrente(int numeroConta, double saldo,double taxaOperacao) {
		super(numeroConta, saldo);
		this.taxaOperacao = taxaOperacao;
	}
	
	@Override
	public void sacar(double valor) {
		if (getSaldo() <= 0) {
			System.out.println("Não possui saldo!");
		} 
		else {
			setSaldo(getSaldo()-(valor+taxaOperacao));
		}
	}

	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo()+(valor-taxaOperacao));
		
	}

	public double getTaxaOperacao() {
		return taxaOperacao;
	}

	public void setTaxaOperacao(double taxaOperacao) {
		this.taxaOperacao = taxaOperacao;
	}

	@Override
	public void mostraDados() {
		System.out.println("Conta Corrente");
		System.out.println("Numero da Conta:" + numeroConta);
		System.out.println("Saldo:" + saldo);
		System.out.println("Taxa de Operacao:" + taxaOperacao);
		System.out.println("-----------------------");
	}

	@Override
	public int hashCode() {
		return Objects.hash(taxaOperacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		return Double.doubleToLongBits(taxaOperacao) == Double.doubleToLongBits(other.taxaOperacao);
	}

	

	

}

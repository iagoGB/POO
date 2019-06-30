package br.com.poo.smd.lista09;

import java.util.List;

import br.com.poo.smd.lista03.ContaBancaria;
import br.com.poo.smd.lista03.Operacao;

public class ContaEspecial extends ContaBancaria {
	private float limiteExtra;
	public ContaEspecial(String nome, int numeroConta, int numAgencia, float saldo, List<Operacao> lista,float lm) {
		super(nome, numeroConta, numAgencia, saldo, lista);
		this.limiteExtra = lm;
	}
	public float getLimiteExtra() {
		return limiteExtra;
	}
	public void setLimiteExtra(float limiteExtra) {
		this.limiteExtra = limiteExtra;
	}
	
	public void sacar() {
		
	}
	
	public void depositar() {
		
	}
	
	@Override
	public String toString() {
		return super.toString()+" ContaEspecial [limiteExtra=" + limiteExtra + "]";
	}
	
	
	

}

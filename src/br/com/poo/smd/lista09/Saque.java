package br.com.poo.smd.lista09;

import br.com.poo.smd.lista03.Operacao;

public class Saque extends Operacao{
	private int contaOrigem;
	public Saque(float valor, int cO) {
		super(valor);
		this.contaOrigem = cO;
	}
	public int getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(int contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	
	

}

package br.com.poo.smd.lista09;

import br.com.poo.smd.lista03.Operacao;

public class Transferencia extends Operacao{
	private int contaOrigem;
	private int contaDestino;
	public Transferencia(float valor, int cO, int cD) {
		super(valor);
		this.contaOrigem = cO;
		this.contaDestino = cD;
		
	}
	public int getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(int contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	public int getContaDestino() {
		return contaDestino;
	}
	public void setContaDestino(int contaDestino) {
		this.contaDestino = contaDestino;
	}
	@Override
	public String toString() {
		return "Transferencia [contaOrigem=" + contaOrigem + ", contaDestino=" + contaDestino + ", valorOperacao="
				+ valorOperacao + "]";
	}

}

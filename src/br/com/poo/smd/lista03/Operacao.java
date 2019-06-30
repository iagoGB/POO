package br.com.poo.smd.lista03;
//original
public class Operacao {
	protected float valorOperacao;
	
    // Questão 1-b. Realizar operações básicas de saque e depósito.
	// Questão 1-c Retornar o extrato
	
	public Operacao( float valor) {
		setValorOperacao(valor);
	}
	
	
	@Override
	public String toString() {
		return "Operacao [valorOperacao=" + valorOperacao + "]";
	}



	public void setValorOperacao(float v) {
		this.valorOperacao = v;
	}
	
	public float getValorOperacao() {
		return this.valorOperacao;
	}
	
	
}

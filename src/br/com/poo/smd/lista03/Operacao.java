package br.com.poo.smd.lista03;
//original
public class Operacao {
	protected float valorOperacao;
	
    // Quest�o 1-b. Realizar opera��es b�sicas de saque e dep�sito.
	// Quest�o 1-c Retornar o extrato
	
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

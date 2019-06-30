package br.com.poo.smd.lista05;

public class Operacao {
	private char tipoOperacao;
	private float valorOperacao;
	
    // Quest�o 1-b. Realizar opera��es b�sicas de saque e dep�sito.
	// Quest�o 1-c Retornar o extrato
	
	public Operacao(char tipo, float valor) throws OperacaoDesconhecidaException, ValorNegativoZeroException {
		setTipoOperacao(tipo);
		setValorOperacao(valor);
	}
	
	public void setTipoOperacao(char tipoOp)  throws OperacaoDesconhecidaException{
		if (tipoOp !='s' && tipoOp !='d') {
			throw new OperacaoDesconhecidaException(tipoOp);
		} else {
			this.tipoOperacao = tipoOp;
		}
	}
	
	public char getTipoOperacao(){
		return this.tipoOperacao;
	}
	
	public void setValorOperacao(float v) throws ValorNegativoZeroException {
		if (v <= 0) {
			throw new ValorNegativoZeroException(v);
		} 
		else {
			this.valorOperacao = v;
		}
	}
	
	public float getValorOperacao() {
		return this.valorOperacao;
	}
	
	@Override
	public String toString() {
		return "Operacao [Tipo de Opera��o = " + tipoOperacao + ", valor da Operac�o = " + valorOperacao + "]";
	}
}

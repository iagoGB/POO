package Lista03;

public class Operacao {
	private char tipoOperacao;
	private float valorOperacao;
	
    // Quest�o 1-b. Realizar opera��es b�sicas de saque e dep�sito.
	// Quest�o 1-c Retornar o extrato
	
	public Operacao(char tipo, float valor) {
		setTipoOperacao(tipo);
		setValorOperacao(valor);
	}
	
	public void setTipoOperacao(char tipoOp) {
		this.tipoOperacao = tipoOp;
	}
	
	public char getTipoOperacao() {
		return this.tipoOperacao;
	}
	
	public void setValorOperacao(float v) {
		this.valorOperacao = v;
	}
	
	public float getValorOperacao() {
		return this.valorOperacao;
	}
	
	@Override
	public String toString() {
		return "Operacao [Tipo de Opera��o = " + tipoOperacao + ", valor da Operac�o = " + valorOperacao + "]";
	}
}

package Lista05;

public class ValorNegativoZeroException extends Exception {
	private float valor;
	
	 ValorNegativoZeroException(float v) {
		super();
		this.valor = v;
	}
	@Override
	public String toString() {
		return "ValorNegativoZeroException  Voc� inseriu " + valor + " R$. N�o � possivel realizar opera��es com valores negativos ou nulo.";
	}
	
}

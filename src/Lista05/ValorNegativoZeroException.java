package Lista05;

public class ValorNegativoZeroException extends Exception {
	private float valor;
	
	 ValorNegativoZeroException(float v) {
		super();
		this.valor = v;
	}
	@Override
	public String toString() {
		return "ValorNegativoZeroException  Você inseriu " + valor + " R$. Não é possivel realizar operações com valores negativos ou nulo.";
	}
	
}

package Lista05;

public class ValorNegativoZeroException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1203114560470282761L;
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

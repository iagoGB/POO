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
		return "ValorNegativoZeroException  Voc� inseriu " + valor + " R$. N�o � possivel realizar opera��es com valores negativos ou nulo.";
	}
	
}

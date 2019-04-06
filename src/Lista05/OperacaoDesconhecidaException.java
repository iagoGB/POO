package Lista05;

public class OperacaoDesconhecidaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private char dado;
	
	OperacaoDesconhecidaException(char digito){
		super();
		this.dado = digito;
	}

	@Override
	public String toString() {
		return "A opera��o " + this.dado + " � inv�lida. Por favor, digite 's' para saque ou 'd' para deposito]";
	}
	
	
}

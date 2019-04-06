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
		return "A operação " + this.dado + " é inválida. Por favor, digite 's' para saque ou 'd' para deposito]";
	}
	
	
}

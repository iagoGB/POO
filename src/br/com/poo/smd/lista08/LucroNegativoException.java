package br.com.poo.smd.lista08;

public class LucroNegativoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String valor;
	
	public LucroNegativoException(String digitado){
		super();
		this.valor = digitado;
	}
	
	public String getMessage(){
		return valor;
		
	}

	
	
}

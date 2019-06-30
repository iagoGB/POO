package br.com.poo.smd.lista11;

public class PessoaJuridica extends Contribuinte {
	public PessoaJuridica(String nome, double rendaBruta,String cpnj) {
		super(nome, rendaBruta);
		setCnpj(cnpj);
	}


	private String cnpj;
	
	
	double calculaImposto() {
		double imposto = getRendaBruta()*0.10;
		return imposto;
		
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj2) {
		this.cnpj = cnpj2;
	}
	
}

package Lista11;

public class PessoaFisica extends Contribuinte {
	String cpf;
	CalculaImposto pf; // interface
	
	public PessoaFisica(String nome, double rendaBruta, String cpf) {
		super(nome, rendaBruta);
		setCalculador();
	}

	public String getCnpj() {
		return cpf;
	}


	public void setCnpj(String cnpj) {
		this.cpf = cnpj;
	}


	public CalculaImposto getPf() {
		return pf;
	}


	public void setPf(CalculaImposto pf) {
		this.pf = pf;
	}
	
	void setCalculador (){
		setPf(CalculaSalarioFactory.criaCalculo(getRendaBruta()));
	}

	
	@Override
	double calculaImposto() {
		return pf.calculaImpostoFisico(rendaBruta);
		
	}
	

}

package br.com.poo.smd.lista11;

public class PessoaFisica extends Contribuinte {
	private Integer id;
	private static Integer idCount = 0;
	private String cpf;
	private CalculaImposto pf; // interface
	
	PessoaFisica(String nome, double rendaBruta, String cpf) {
		super(nome, rendaBruta);
		this.id = PessoaFisica.idCount++;
		setCalculador();
	}

	public void setCnpj(String cnpj) {
		this.setCpf(cnpj);
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

	public Integer getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}

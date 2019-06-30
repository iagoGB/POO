package br.com.poo.smd.lista11;

public abstract class Contribuinte {
	protected String nome;
	protected double rendaBruta;
	
	public Contribuinte(String nome, double rendaBruta) {
		super();
		this.nome = nome;
		this.rendaBruta = rendaBruta;
	}

	abstract double calculaImposto();

	public String getNome() {
		return nome;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

package br.com.poo.smd.lista11;

public class Salario2100 implements CalculaImposto{

	@Override
	public double calculaImpostoFisico(double rendaBruta) {
		return rendaBruta * 0.10;
	}
	
}

package br.com.poo.smd.lista11;

public class Salario3600 implements CalculaImposto {

	@Override
	public double calculaImpostoFisico(double rendaBruta) {
		return rendaBruta * 0.25;
	}

}

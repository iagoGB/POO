package br.com.poo.smd.lista11;

public class Salario2800 implements CalculaImposto {

	@Override
	public double calculaImpostoFisico(double rendaBruta) {
		return rendaBruta * 0.15;
	}

}

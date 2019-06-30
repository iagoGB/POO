package br.com.poo.smd.lista11;

public class SalarioSuperior implements CalculaImposto {

	@Override
	public double calculaImpostoFisico(double rendaBruta) {
		return rendaBruta *0.30;
	}

}

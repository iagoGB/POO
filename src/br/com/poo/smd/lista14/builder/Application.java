package br.com.poo.smd.lista14.builder;

public class Application {

	public static void main(String[] args) {
		Combo c = new Combo.ComboBuilder()
				.hamburguer(" Dois andares")
				.batata(" com cheddar")
				.brinquedo(" Mario")
				.refrigerante(" Cola")
				.criaCombo();
		System.out.println(c.toString());
	}

}

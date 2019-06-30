package br.com.poo.smd.lista14.builder;

public class Combo {
	private String hamburguer;
	private String batata;
	private String refrigerante;
	private String brinquedo;

	private Combo(String hamburguer, String batata, String refrigerante, String brinquedo) {
		this.hamburguer = hamburguer;
		this.batata = batata;
		this.refrigerante = refrigerante;
		this.brinquedo = brinquedo;
	}

	public static  class ComboBuilder {
		private String hamburguer;
		private String batata;
		private String refrigerante;
		private String brinquedo;
		
		public ComboBuilder() {
			
		}
		public ComboBuilder hamburguer(String h) {
			this.hamburguer = h;
			return this;
		}
		public ComboBuilder batata(String b) {
			this.batata = b;
			return this;
		}
		public ComboBuilder refrigerante(String r) {
			this.refrigerante = r;
			return this;
		}
		public ComboBuilder brinquedo(String b) {
			this.brinquedo = b;
			return this;
		}
		public Combo criaCombo() {
			return new Combo(hamburguer,batata,refrigerante,brinquedo);
		}
	}

	@Override
	public String toString() {
		return "Combo [hamburguer=" + hamburguer + ", batata=" + batata + ", refrigerante=" + refrigerante
				+ ", brinquedo=" + brinquedo + "]";
	}
	
}

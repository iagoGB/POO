package br.com.poo.smd.lista11;

public class Application {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("j", 990, "2509099");
		PessoaFisica pf2 = new PessoaFisica("L", 20250, "311112");
		PessoaFisica pf3 = new PessoaFisica("K", 12112, "92839");

		
		System.out.println("Ids:" + pf.getId() +" "+ pf2.getId()+" "+pf3.getId());
	}

}

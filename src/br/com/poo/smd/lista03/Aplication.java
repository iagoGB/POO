package br.com.poo.smd.lista03;

import java.util.ArrayList;

public class Aplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<Operacao> minhaOperacao = new ArrayList<Operacao>();
		
		ContaBancaria minhaConta = new ContaBancaria("Iago",7,220,0,minhaOperacao);
		System.out.println(minhaConta.toString());
		/*
		Operacao op01 = new Operacao('d',120.50f);
		Operacao op02 = new Operacao('s',12);
		minhaConta.adicionaOperacao(op01);
		minhaConta.adicionaOperacao(op02); 
	
		System.out.println(minhaConta.toString()); */
		
		/* Questão 2 -
		 	crie um método main que é capaz de instanciar uma conta com saldo de R$100,00. 
		 	Aplique 3 depósitos seguindos de valores R$50,00, R$200,00 e R$1,00 e dois saques 
		 	seguidos R$350,00 e R$10,00. Qual valor restou em conta? Apresente a sequência de 
		 	chamadas aos métodos e imprima mensagens ao usuário em caso de sucesso ou de falha.
		  
		*/
		ArrayList<Operacao> outraLista = new ArrayList<Operacao>();
		ContaBancaria outraConta = new ContaBancaria("Dono",120,18,100,outraLista);
		/*
		Operacao dep01 = new Operacao('d',50f);
		Operacao dep02 = new Operacao('d',200f);
		Operacao dep03 = new Operacao('d',1f);
		
		outraConta.adicionaOperacao(dep01);
		outraConta.adicionaOperacao(dep02);
		outraConta.adicionaOperacao(dep03);
		
		Operacao saq01 = new Operacao('s',350f);
		Operacao saq02 = new Operacao('s',10f);
		
		outraConta.adicionaOperacao(saq01);
		outraConta.adicionaOperacao(saq02); // Não entra na lista pois valor para sacar maior do que saldo em conta

		System.out.println(outraConta.toString());
		outraConta.listaOperacao(4);

		*/

		
		
	}

}

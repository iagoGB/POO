package br.com.poo.smd.lista03;

import java.util.List;

import br.com.poo.smd.lista09.Saque;
import br.com.poo.smd.lista09.Transferencia;




public class ContaBancaria {
	protected String nome;
	protected int numeroConta;
	protected int numAgencia;
	protected float saldo;
	protected List<Operacao> listaOperacao;
	
	// Questão 1-a. Guardar e retornar o número da conta.


	public ContaBancaria(String nome,int numeroConta, int numAgencia, float saldo, List<Operacao> lista) {
		setNome(nome);
		setNumeroConta(numeroConta);
		setNumAgencia(numAgencia);
		setSaldo(saldo);
		setListaOperacao(lista);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public List<Operacao> getListaOperacao() {
		return listaOperacao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nome=" + nome + ", numeroConta=" + numeroConta + ", numAgencia=" + numAgencia
				+ ", saldo=" + saldo + ", listaOperacao=" + listaOperacao + "]";
	}

	public void setListaOperacao(List<Operacao> listaOperacao) {
		this.listaOperacao = listaOperacao;
	}
	
	//e. Verificar se os valores para saque e depósito são positivos e válidos para essas operações

	
	public void sacar(Saque s) {
		if (s.getValorOperacao() > getSaldo()) {
			System.out.println("Saldo insuficiente");
		} else {
			setSaldo(getSaldo()-s.getValorOperacao());
			System.out.println("Sacado!");
			adicionaOp(s);
		}
		
	}
	
	public void depositar (Transferencia t) {
		if (t.getValorOperacao() <= 0) {
			System.out.println("Valor negativo");
		} else {
			setSaldo(getSaldo()+t.getValorOperacao());
			getListaOperacao().add(t);
		}
	}
	
	protected void adicionaOp(Operacao op) {
		getListaOperacao().add(op);
	}
	
	public void listaOperacao(int valor) {

		for (int i = 0;i<valor; i++) {
				System.out.println(getListaOperacao().get(i));
		}
	}
}

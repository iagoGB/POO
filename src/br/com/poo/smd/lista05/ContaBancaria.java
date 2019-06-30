package br.com.poo.smd.lista05;

import java.util.List;

public class ContaBancaria {
	private String nome;
	private int numeroConta;
	private int numAgencia;
	private float saldo;
	private List<Operacao> listaOperacao;
	
	// Quest�o 1-a. Guardar e retornar o n�mero da conta.


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
		return "ContaBancaria [Nome = " + nome + ", Numero da Conta = " + numeroConta + ", numero da Agencia = " + numAgencia
				+ ", saldo = " + saldo + ", lista de Opera��es = " + listaOperacao + "]";
	}

	public void setListaOperacao(List<Operacao> listaOperacao) {
		this.listaOperacao = listaOperacao;
	}
	
	//e. Verificar se os valores para saque e dep�sito s�o positivos e v�lidos para essas opera��es

	
	public void adicionaOperacao(Operacao op) {
		
		if (((op.getTipoOperacao() !='d') && (op.getTipoOperacao() !='s')) || (op.getValorOperacao() < 0)){
			System.out.println("Valor ou tipo de opera��o inv�lida");
		} else if (op.getTipoOperacao() == 'd') {
			setSaldo(getSaldo()+op.getValorOperacao());
			getListaOperacao().add(op);
			System.out.println("Opera��o realizada com sucesso!");
		} else if ((op.getTipoOperacao() == 's') && (this.getSaldo()>=op.getValorOperacao())){
			setSaldo(getSaldo()-op.getValorOperacao());
			getListaOperacao().add(op);
			System.out.println("Opera��o realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente para saque");
		}
	}
	
	public void listaOperacao(int valor) {

		for (int i = 0;i<valor; i++) {
				System.out.println(getListaOperacao().get(i));
		}
	}
}

package br.com.poo.smd.lista08;

public class Quarto {
	private int numero;
	private int andar;
	private boolean isDisponivel;
	private int reservas;
	private float preco;
	private float lucro;
	
	public Quarto( int n,int a,float p) {
		setNumero(n);
		setAndar(a);
		setPreco(p);
		setReservas(0);
		setDisponivel(true);
	}
	
	public void setNumero(int n) {
		this.numero = n;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public boolean isDisponivel() {
		return isDisponivel;
	}

	public void setDisponivel(boolean isDisponivel) {
		this.isDisponivel = isDisponivel;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getReservas() {
		return reservas;
	}

	public void setReservas(int reservas) {
		this.reservas = reservas;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getLucro() {
		return lucro;
	}

	public void setLucro(float lucro) {
		this.lucro = lucro;
	}
	
	public float calculaLucro(float valorConstrucao) throws LucroNegativoException {
		if (valorConstrucao <= 0) {
			throw new LucroNegativoException("Valor negativo");
		} else {
			float calcLucro = ((getPreco()*getReservas()) - valorConstrucao);
			setLucro(calcLucro);
			return calcLucro;
		}
	}

	@Override
	public String toString() {
		return "Quarto [numero=" + numero + ", andar=" + andar + ", isDisponivel=" + isDisponivel + ", reservas="
				+ reservas + ", preco=" + preco + ", lucro=" + lucro + "]";
	}
	
	public void alugaQuarto(){
		if (isDisponivel()) {
			setDisponivel(false);
			setReservas (getReservas()+1);
		} else {
			System.out.println("O quarto está alugado no momento");
		}
			
	}
	
	public void liberaQuarto() {
		if(!isDisponivel()) {
			setDisponivel(true);
		} else {
			System.out.println("O quarto já está vazio");
		}
	}
	
}

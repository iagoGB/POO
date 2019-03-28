package lista04;

public class Telefone {
	private int ddd;
	private int numero;

	
	public Telefone(int ddd,int num) {  
		setDdd(ddd);
		setNumero(num);
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
		public String toString() {
			return "(" + ddd + ")" + " "+ numero;
		}
}

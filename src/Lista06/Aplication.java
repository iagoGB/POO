package Lista06;

public class Aplication {

	public static void main(String[] args) {
		VetorInteiro vi= new VetorInteiro();
		
		try {
			vi.insereValor(11, 12);
			System.out.println(vi);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Voc� tentou acessar uma posi��o do vetor inexistente. Digite um valor v�lido!");
		}	
	
	}

}

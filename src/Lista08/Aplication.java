package Lista08;

public class Aplication {

	public static void main(String[] args) {
		Quarto q01 = new Quarto(1,1,250);
		try {
			q01.calculaLucro(-20);
			System.out.println(q01);
		} catch (LucroNegativoException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
	}

}

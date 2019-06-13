package Lista11;

public class CalculaSalarioFactory {
	
	static CalculaImposto criaCalculo(double c) {
		if (c <1400) {
			Salario1400 s1400= new Salario1400();
			return s1400;
		} else if (c > 1400 && c< 2100){
			Salario2100 s2100= new Salario2100();
			return s2100;
		}  else if (c> 2100 && c < 2800){
			Salario2800 s2800= new Salario2800();
			return s2800;
		} else if (c> 2800 && c< 3600) {
			Salario3600 s3600= new Salario3600();
			return s3600;
		} else {
			SalarioSuperior ss= new SalarioSuperior();
			return ss;
		}
		
	}
}

package Lista11;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContribuinteFisicoNaoIgualTeste {

	@Test
	public void SalarioAte1400Test() {
		PessoaFisica pf = new PessoaFisica("Carla", 1200, "2030");
		assertNotEquals(100,pf.calculaImposto(),0.050);
	}
	
	@Test
	public void SalarioSuperiorTest() {
		PessoaFisica pf = new PessoaFisica("Carla", 8000, "2030");
		assertNotEquals(1200,pf.calculaImposto(),0.050);
	}
	
	@Test
	public void Salario2800Test() {
		PessoaFisica pf = new PessoaFisica("Carla", 3000, "2030");
		assertNotEquals(700,pf.calculaImposto(),0.050);
	}
}

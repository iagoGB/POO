package br.com.poo.smd.lista11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContribuinteFisicoTest {

	@Test
	public void SalarioAte1400Test() {
		PessoaFisica pf = new PessoaFisica("Jusaara", 800, "2030");
		assertEquals(0,pf.calculaImposto(),0.050);
	}
	
	
	@Test
	public void Salario2800Test() {
		PessoaFisica pf = new PessoaFisica("Jusaara", 2500, "2930");
		assertEquals(375,pf.calculaImposto(),0.050);
	}
	
	@Test
	public void SalarioSuperiorTest() {
		PessoaFisica pf = new PessoaFisica("Jusaara", 4000, "2930");
		assertEquals(1200,pf.calculaImposto(),0.050);
	}

}

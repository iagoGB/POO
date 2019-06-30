package br.com.poo.smd.lista11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PessoaJuridicaTest {

	@Test
	public void PessoaJuridicaTeste () {
		PessoaJuridica pf = new PessoaJuridica ("Jusaara", 9000, "2030");
		assertEquals(900,pf.calculaImposto(),0.050);
	}
	
	@Test
	public void PessoaJuridica2Teste () {
		PessoaJuridica pf = new PessoaJuridica ("Pedro", 1400, "1239");
		assertEquals(140,pf.calculaImposto(),0.050);
	}
	

}

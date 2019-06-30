package br.com.poo.smd.lista08;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuartoTest {
	
	@Test
	public void calculaLucroNegativoException() {
		try {
			Quarto quartoTeste = new Quarto (1,1,500);
			quartoTeste.calculaLucro(-20);
			fail("Falhou!");
		} catch (LucroNegativoException e) {
			e.printStackTrace();
			assertEquals("Valor negativo",e.getMessage());
			
		}
		
	}
	
	@Test
	public void incrementaReservaTest() {
		Quarto quarto01 = new Quarto (2,2,200);
		quarto01.alugaQuarto();
		assertFalse(quarto01.isDisponivel());	
	}
	
}

package Lista08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QuartoTest {
	
	@Test
	void calculaLucroNegativoException() {
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
	void incrementaReservaTest() {
		Quarto quarto01 = new Quarto (2,2,200);
		quarto01.alugaQuarto();
		assertFalse(quarto01.isDisponivel());	
	}
	
}

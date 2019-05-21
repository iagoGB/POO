package Lista07;

import static org.junit.Assert.assertEquals;

//Adicione a library JUnit

import org.junit.Test;

public class VetorInteiroTest {

	@Test
	public void InsereVetorDiferentePosicaoTest() {
		VetorInteiro vi = new VetorInteiro();
		assertEquals(false, vi.insereValor(11, 500));
		assertEquals(true,vi.insereValor(7, 250));
	}
	
	@Test
	public void insereVetorGrandeInteiroTest() {
		VetorInteiro vi = new VetorInteiro();
		assertEquals(true, vi.insereValor(5, 23217387));
		/*Assert.assertEquals(true, vi.insereValor(5, 23217387.23));*/
	}
}

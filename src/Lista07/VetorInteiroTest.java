package Lista07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VetorInteiroTest {

	@Test
	void InsereVetorDiferentePosicaoTest() {
		VetorInteiro vi = new VetorInteiro();
		Assert.assertEquals(false, vi.insereValor(11, 500));
		Assert.assertEquals(true,vi.insereValor(7, 250));
	}
	
	@Test
	void insereVetorGrandeInteiroTest() {
		VetorInteiro vi = new VetorInteiro();
		Assert.assertEquals(true, vi.insereValor(5, 23217387));
		Assert.assertEquals(true, vi.insereValor(5, 23217387.23));
	}
}

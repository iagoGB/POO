package Lista09;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Lista03.ContaBancaria;
import Lista03.Operacao;


public class SaqueTeste {

	
	@Test
	public void saqueSucessoTeste() {
		
		ArrayList<Operacao> lOp = new ArrayList<Operacao>();
		ContaBancaria cB = new ContaBancaria("Julieta", 2, 99, 500, lOp);
		Saque saque = new Saque(200, 2);
		cB.sacar(saque);
		assertEquals(300,cB.getSaldo(),0020);
		
	}
	
	@Test
	public void saqueFracassoTeste() {
		
		ArrayList<Operacao> lOp = new ArrayList<Operacao>();
		ContaBancaria cB = new ContaBancaria("Junior", 2, 99, 100, lOp);
		Saque saque = new Saque(200, 2);
		cB.sacar(saque);
		assertEquals(100,cB.getSaldo(),0020);
	}
	
	

}

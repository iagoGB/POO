package br.com.poo.smd.lista09;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import br.com.poo.smd.lista03.ContaBancaria;
import br.com.poo.smd.lista03.Operacao;

public class TransferenciaTeste {

	@Test
	public void TransferenciaSucessoTest() {
		ArrayList<Operacao> lOp = new ArrayList<Operacao>();
		ContaBancaria cB = new ContaBancaria("Julieta", 2, 99, 500, lOp);
		Transferencia t = new Transferencia(30, 2, 5);
		cB.depositar(t);
		assertEquals(530,cB.getSaldo(),0020);
	}
	
	@Test
	public void TransferenciaFracassoTest() {
		ArrayList<Operacao> lOp = new ArrayList<Operacao>();
		ContaBancaria cB = new ContaBancaria("Mario", 2, 99, 55, lOp);
		Transferencia t = new Transferencia(-5, 2, 5);
		cB.depositar(t);
		assertEquals(55,cB.getSaldo(),0020);
	}

}

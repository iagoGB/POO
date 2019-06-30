package br.com.poo.smd.lista06;

import java.util.Arrays;

public class VetorInteiro {
	private  int vetor[];
	
	public VetorInteiro() {
		setVetor(new int[10]);
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	} 
	
	public void insereValor(int posicao, int valor) throws ArrayIndexOutOfBoundsException {
		if (checkTamanhoMaior(posicao)) 
		{
			throw new ArrayIndexOutOfBoundsException();
		} 
		else
		{
			int[] vec = getVetor();	
			vec[posicao-1] = valor;
			setVetor(vec);
		}
		
	}
	
	@Override
	public String toString() {
		return "VetorInteiro [vetor=" + Arrays.toString(vetor) + "]";
	}

	public boolean checkTamanhoMaior(int index) {
		if ((index-1) > getVetor().length-1) 
		{	
			return true;			
		} else {
			return false;
		}		
	}
}

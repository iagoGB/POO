package br.com.poo.smd.lista07;

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
	
	public boolean insereValor(int posicao, int valor) {
		
		if (checkTamanhoMaior(posicao)) 
		{
			return false;
		} 
		else
		{
			return true;
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

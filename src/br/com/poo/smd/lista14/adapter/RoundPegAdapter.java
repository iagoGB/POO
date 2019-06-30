package br.com.poo.smd.lista14.adapter;

public class RoundPegAdapter implements Peg {
	RoundPeg roundPeg;
	
	public RoundPegAdapter(RoundPeg rp) {
		this.roundPeg = rp;	
	}
	@Override
	public void insert(String str) {
		roundPeg.insertIntoHole(str);
	}

}

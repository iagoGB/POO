package br.com.poo.smd.lista14.adapter;

public class Client {

	public static void main(String[] args) {
		RoundPeg rp = new RoundPeg();
		RoundPegAdapter rpa = new RoundPegAdapter(rp);
		rpa.insert("Inserindo no buraco com o metodo square");

	}

}

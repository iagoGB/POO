package Lista04;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> listaDeContato;
	
	public Agenda(ArrayList<Contato> l) {
		setListaDeContato(l);
	}

	@Override
	public String toString() {
		return "Agenda [Lista De Contato = " + listaDeContato + "]";
	}

	public ArrayList<Contato> getListaDeContato() {
		return listaDeContato;
	}

	public void setListaDeContato(ArrayList<Contato> listaDeContato) {
		this.listaDeContato = listaDeContato;
	}
	
	public void adicionaContato(Contato novoContato) {
		getListaDeContato().add(novoContato);
	}
	
	public void removeContato(Contato rc) {
		for(Contato c: getListaDeContato()) {
			if ((rc.getNome() == c.getNome()) && (rc.getEmail()==c.getEmail())){}
				getListaDeContato().remove(c);
				return;
		}
	}
	
}

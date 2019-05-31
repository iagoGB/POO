package Lista10.mainclass;

import java.util.ArrayList;

import Lista10.exception.ContaInexistenteException;
import Lista10.superclass.ContaBancaria;
import Lista10.util.Imprimivel;

public class Banco implements Imprimivel {
	ArrayList <ContaBancaria> listaConta;

	public ArrayList<ContaBancaria> getListaConta() {
		return listaConta;
	}
	
	public Banco(ArrayList<ContaBancaria>al) {
		this.listaConta = al;
	}

	public void setListaConta(ArrayList<ContaBancaria> listaConta) {
		this.listaConta = listaConta;
	}
	
	public void inserirConta(ContaBancaria cb){
		listaConta.add(cb);
	}
	public void removerConta(ContaBancaria cb){
		listaConta.remove(cb);
	}
	public ContaBancaria procurarConta( int numeroConta ) throws ContaInexistenteException {
		for( ContaBancaria cb : listaConta )
			if( cb.getNumeroConta() == numeroConta )
				return cb;

		throw new ContaInexistenteException("Conta Inexistente");
	}

	@Override
	public void mostraDados() {
		for( ContaBancaria cb : listaConta )
			cb.mostraDados();
	}
}

package td04;

import java.util.ArrayList;

public class Aplication {

	public static void main(String[] args) {
		ArrayList<Telefone> meusTel = new ArrayList<Telefone>();
		ArrayList<Telefone> meusTel2 = new ArrayList<Telefone>();
		ArrayList<Telefone> meusTel3 = new ArrayList<Telefone>();

		Telefone t1 = new Telefone(85,909328329);
		Telefone t2 = new Telefone(85,559328221);
		Telefone t3 = new Telefone(12,8898221);
		
		meusTel.add(t1); meusTel2.add(t2);	meusTel3.add(t3);


		Contato c= new Contato("Iago","iago@iago.com",meusTel);
		Contato c2= new Contato("Antonio","a@email.com",meusTel2);
		Contato c3= new Contato("Creuza","creuza@cr.com",meusTel3);


		System.out.println(c.toString());
		
		//Adicionando por lista
		ArrayList<Telefone> ol = new ArrayList<Telefone>();
		ol.add(t2);		ol.add(t1);		ol.add(t3); 	ol.add(t2);
		c.adiciona(ol);
		
		//Adionando por unidade
		Telefone tTeste = new Telefone(99,202020);
		c.adiciona(tTeste);
		
		System.out.println(c.toString());
		
		
		ArrayList<Contato> cont = new ArrayList<Contato>();
		Agenda minhaAgenda = new Agenda(cont);
		minhaAgenda.adicionaContato(c); 		
		minhaAgenda.adicionaContato(c2); 		
		minhaAgenda.adicionaContato(c3);


		System.out.println(minhaAgenda.toString());





	}

}

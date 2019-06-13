package Lista04;

import java.util.List;

public class Contato {
	private String nome;
	private String email;
	private List<Telefone> telefone;
	
	public boolean checkVazio(String arg0) {
		if ((arg0 =="")|| (arg0 == null))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public Contato(String n, String e,List<Telefone>l) {
		if (checkVazio(n) || checkVazio(e))
		{
			System.out.println("Valores inválidos");
			return;
		} 
		else 
		{
			setNome(n);
			setEmail(e);
			setMeusNumeros(l);
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Telefone> getMeusNumeros() {
		return telefone;
	}
	public void setMeusNumeros(List<Telefone> meusNumeros) {
		this.telefone = meusNumeros;
	}
	
	public void adiciona(Telefone n) {
		getMeusNumeros().add(n);
	}
	
	public void adiciona(List<Telefone> ln) {
		getMeusNumeros().addAll(ln);
	}
	

	@Override
	public String toString() {
		return "Contato [nome = " + nome + ", email = " + email + ", Telefone(s) =" + telefone + "] "+"\n";
	}
	
}

package br.com.poo.smd.lista02;

public class Livro {
	 String titulo;
	 String autor;
	 String editora;
	 int anoPublicacao;
	 int numPagina; // Questão 1 item a
	 int edicao; // Questão 1 item a
	
	
	public Livro() { 
		
		//Questão 1 item b
		
	}
	
	public Livro(String t,String a,String e, int aP, int nP, int ed) {
		//Questão 1 item b
		setTitulo(t);
		setAutor(a);
		setEditora(e);
		setAnoPublicacao(aP);
		setNumPagina(nP);
		setEdicao(ed);
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getNumPagina() {
		return numPagina;
	}

	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", anoPublicacao="
				+ anoPublicacao + ", numPagina=" + numPagina + ", edicao=" + edicao + "]";
	}
	
}

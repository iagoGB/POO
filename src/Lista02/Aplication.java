package Lista02;

public class Aplication {

	public static void main(String[] args) {
		
		/*
		   Questao 2 item a e b - Criar duas vari�veis do tipo livro usando construtor padr�o e 
		   o que recebe par�metros.
		*/
		
		Livro l01 = new Livro();
		Livro l02 = new Livro("Engenharia de Software","Sommerville","Nova",2000,800,4);
		
		// Quest�o 2 item c
		System.out.println(l01.titulo);
	
		 /* 
		   No comando acima, como o objeto foi instanciado com o construtor padr�o, 
		   n�o h� nada dentro do atributo  titulo, logo � exibido nulo.
		*/
		
		// Quest�o 2 item d
		System.out.println(l02.titulo);
		
		 /* 
		   O objeto precisava de par�metros para ser iniciado, 
		   ent�o ao executar o comando acima,� exibido a String atribuida no construtor.
		*/
		
		
		//Quest�o 2 item e - Imprimir o valor dos atributos do livro02
		System.out.println(l02.toString());


		//Quest�o 2 item f Instanciar novo livro com construtor padr�o e atribuir a livro02
		
		Livro l03 = new Livro();
		System.out.println(l03.toString());
		l03 = l02;
		
		//Quest�o 2 item g Imprimir o valor dos livros 2 e 3
		
		System.out.println(l02.toString());
		System.out.println(l03.toString());
		
		/* Livro 03 que foi instanciado vazio passou a conter os dados do livro02. */
		
		//Quest�o 2 item h Atribuir a vari�vel livro 1 a livro2
		
		l02 = l01;
		
		//Quest�o 2 item i
		System.out.println();
		System.out.println(l01.toString());
		System.out.println(l02.toString());		
		System.out.println(l03.toString());
		
		/* 
		 	Ap�s a ultima atribui��o, ambos os livros 1 e 2 est�o nulos, enquanto o 3 continua
		 	preenchido com os antigos atributos do livro 2.
		*/
	}

}

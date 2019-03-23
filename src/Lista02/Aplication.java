package Lista02;

public class Aplication {

	public static void main(String[] args) {
		
		/*
		   Questao 2 item a e b - Criar duas variáveis do tipo livro usando construtor padrão e 
		   o que recebe parâmetros.
		*/
		
		Livro l01 = new Livro();
		Livro l02 = new Livro("Engenharia de Software","Sommerville","Nova",2000,800,4);
		
		// Questão 2 item c
		System.out.println(l01.titulo);
	
		 /* 
		   No comando acima, como o objeto foi instanciado com o construtor padrão, 
		   não há nada dentro do atributo  titulo, logo é exibido nulo.
		*/
		
		// Questão 2 item d
		System.out.println(l02.titulo);
		
		 /* 
		   O objeto precisava de parâmetros para ser iniciado, 
		   então ao executar o comando acima,é exibido a String atribuida no construtor.
		*/
		
		
		//Questão 2 item e - Imprimir o valor dos atributos do livro02
		System.out.println(l02.toString());


		//Questão 2 item f Instanciar novo livro com construtor padrão e atribuir a livro02
		
		Livro l03 = new Livro();
		System.out.println(l03.toString());
		l03 = l02;
		
		//Questão 2 item g Imprimir o valor dos livros 2 e 3
		
		System.out.println(l02.toString());
		System.out.println(l03.toString());
		
		/* Livro 03 que foi instanciado vazio passou a conter os dados do livro02. */
		
		//Questão 2 item h Atribuir a variável livro 1 a livro2
		
		l02 = l01;
		
		//Questão 2 item i
		System.out.println();
		System.out.println(l01.toString());
		System.out.println(l02.toString());		
		System.out.println(l03.toString());
		
		/* 
		 	Após a ultima atribuição, ambos os livros 1 e 2 estão nulos, enquanto o 3 continua
		 	preenchido com os antigos atributos do livro 2.
		*/
	}

}

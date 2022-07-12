package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		
		Livros livros = new Livros();
		Gato gato = new Gato(null, null, null);
		
		int a = 3;
		int b = 4;
		System.out.println("Hello World! " + (a+b));
		System.out.println(gato);
		System.out.println(livros);
	}
}
 
class Livros{
	private String nome;
	private String npag;
}
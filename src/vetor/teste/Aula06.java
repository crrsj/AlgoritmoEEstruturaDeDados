package vetor.teste;

import vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);	
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
	    vetor.adiciona("Elemento 3");
	    System.out.println(vetor.busca("elemento 1"));
	    System.out.println(vetor.busca("Elemento 4"));
	    System.out.println(vetor.busca("Elemento 2"));
	}
}

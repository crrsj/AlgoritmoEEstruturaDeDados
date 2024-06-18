package vetor.teste;

import vetor.Lista;


public class Aula11 {

	public static void main(String[] args) {
		Lista<Contato> vetor =  new Lista(1);
		
		Contato c1 = new Contato("Carlos","123","carlos@gmail.com");		
		vetor.adiciona(c1);
		System.out.println(vetor);
		
	}
}

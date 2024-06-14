package vetor.teste;

import vetor.VetorObjeto;

public class Aula10 {

	public static void main(String[] args) { 
		VetorObjeto vetor = new VetorObjeto(3);
		
	
	Contato c1 = new Contato("Carlos","123","carlos@gmail.com");
	Contato c2 = new Contato("Roberto","1234","carlos1@gmail.com");
	Contato c3 = new Contato("Ribeiro","12345","carlos2@gmail.com");
	
	Contato c4 = new Contato("Ribeiro","12345","carlos2@gmail.com");
	vetor.adiciona(c1);
	vetor.adiciona(c2);
	vetor.adiciona(c3);
	System.out.println("Tamanho =" + vetor.tamanho());
	
	int pos = vetor.busca(c4);
		
	if(pos >-1) {
		System.out.println("Elemento existe no vetor");
	}else {
		System.out.println("Elemento não existe no vetor");
	}
	
	System.out.println(vetor);

	
 }
}
package vetor.teste;

import java.util.ArrayList;

public class Aula12 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);
		arrayList.add(1,"B");
		System.out.println(arrayList);
		
		int pos = arrayList.indexOf("A");
		
		if(pos > -1) {
			System.out.println("Elemento existe no array " + pos);
		}else {
			System.out.println("Elemento não existe no array");
		}
    	System.out.println(arrayList.get(1));
    	arrayList.remove(0);
    	System.out.println(arrayList);
    	System.out.println(arrayList.size());
	
	
	}

}

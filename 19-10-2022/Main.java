package teste;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Colecionavel> list = new ArrayList<>();
		
		ArrayList<String> listStrings = new ArrayList<>();
		listStrings.add("hello");
		
		Colecionavel l = new Livro("a", "b", "c", listStrings, "e", "f");
		Colecionavel c = new CD("a", "b1", "c", listStrings, "e", listStrings);
		Colecionavel d = new DVD("a", "b2", "c", listStrings, "e", "f", listStrings);
		Colecionavel r = new Revista("a", "b3", "c", listStrings, "e", "f", "g", listStrings);
		
		list.add(l);
		list.add(c);
		list.add(d);
		list.add(r);
		
		for (Colecionavel colecionavel : list) {
			System.out.println(colecionavel);
		}
		
		System.out.println("Por tipo\n");
		
		for (Colecionavel colecionavel : list) {
			if(colecionavel instanceof Revista) {
				System.out.println(colecionavel);
			}
		}
		
		System.out.println("Por titulo\n");
		
		for (Colecionavel colecionavel : list) {
			if(colecionavel.titulo.equals("b3")) {
				System.out.println(colecionavel);
			}
		}
		
	}
}

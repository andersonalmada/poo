package teste;

import java.util.ArrayList;

public class CD extends Colecionavel {

	public CD(String identificacao, String titulo, String data, ArrayList<String> autores, String genero,
			ArrayList<String> musicas) {
		super(identificacao, titulo, data, autores);
		this.genero = genero;
		this.musicas = musicas;
	}

	String genero;
	ArrayList<String> musicas;

}

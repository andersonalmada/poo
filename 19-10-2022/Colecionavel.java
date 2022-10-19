package teste;

import java.util.ArrayList;

public class Colecionavel {

	public Colecionavel(String identificacao, String titulo, String data, ArrayList<String> autores) {
		super();
		this.identificacao = identificacao;
		this.titulo = titulo;
		this.data = data;
		this.autores = autores;
	}
	
	String identificacao;
	String titulo;
	String data;
	ArrayList<String> autores;
}

package teste;

import java.util.ArrayList;

public class Revista extends Colecionavel {

	public Revista(String identificacao, String titulo, String data, ArrayList<String> autores, String ano,
			String volume, String editora, ArrayList<String> assuntos) {
		super(identificacao, titulo, data, autores);
		this.ano = ano;
		this.volume = volume;
		this.editora = editora;
		this.assuntos = assuntos;
	}

	String ano;
	String volume;
	String editora;
	ArrayList<String> assuntos;

	@Override
	public String toString() {
		return "Revista [ano=" + ano + ", volume=" + volume + ", editora=" + editora + ", assuntos=" + assuntos + "]";
	}

}

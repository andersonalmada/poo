package teste;

import java.util.ArrayList;

public class Livro extends Colecionavel {

	public Livro(String identificacao, String titulo, String data, ArrayList<String> autores, String editora,
			String anoPublicacao) {
		super(identificacao, titulo, data, autores);
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
	}

	String editora;
	String anoPublicacao;
	@Override
	public String toString() {
		return "Livro [editora=" + editora + ", anoPublicacao=" + anoPublicacao + "]";
	}
	
	
}

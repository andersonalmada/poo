package teste;

import java.util.ArrayList;

public class DVD extends Colecionavel {

	public DVD(String identificacao, String titulo, String data, ArrayList<String> autores, String tipo,
			String descricao, ArrayList<String> extras) {
		super(identificacao, titulo, data, autores);
		this.tipo = tipo;
		this.descricao = descricao;
		this.extras = extras;
	}

	String tipo;
	String descricao;
	ArrayList<String> extras;

}

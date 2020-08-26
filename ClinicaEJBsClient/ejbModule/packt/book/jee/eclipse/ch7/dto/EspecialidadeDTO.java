package packt.book.jee.eclipse.ch7.dto;

import java.io.Serializable;

public class EspecialidadeDTO implements Serializable  {
	private static final long serialVersionUID = 1L;


	private int idEspecialidade;

	private String nomeEspecialidade;
	
	public int getIdEspecialidade() {
		return this.idEspecialidade;
	}

	public void setIdEspecialidade(int idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}

	public String getNomeEspecialidade() {
		return this.nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}




}

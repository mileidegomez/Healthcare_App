package packt.book.jee.eclipse.ch7.dto;

import java.io.Serializable;
import java.util.List;

import packt.book.jee.eclipse.ch7.jpa.Consulta;
import packt.book.jee.eclipse.ch7.jpa.Especialidade;

public class MedicoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private int idMedico;

	private String contactoMedico;

	private String moradaMedico;

	private String nomeMedico;
	
	private Especialidade especialidade;
	
	public int idEspecMedico;
	
	public String nomeEspcMedico;
	
	public String getnomeEspcMedico() {
		Especialidade idEspecMedico = this.especialidade;
		nomeEspcMedico = idEspecMedico.getNomeEspecialidade();
		return nomeEspcMedico;
	}
	
	public void setnomeEspcMedico(String nomeEspcMedico) {
		
		this.nomeEspcMedico = nomeEspcMedico; }
	


	private List<Consulta> consultas;
	
	
	public int getIdMedico() {
		return this.idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	public String getContactoMedico() {
		return this.contactoMedico;
	}

	public void setContactoMedico(String contactoMedico) {
		this.contactoMedico = contactoMedico;
	}

	public String getMoradaMedico() {
		return this.moradaMedico;
	}

	public void setMoradaMedico(String moradaMedico) {
		this.moradaMedico = moradaMedico;
	}

	public String getNomeMedico() {
		return this.nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

/*	public int getRefIdEspc() {
		return this.refIdEspc;
	}

	public void setRefIdEspc(int refIdEspc) {
		this.refIdEspc = refIdEspc;
	} */

	public List<Consulta> getConsultas() {
		return this.consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	} 	
	
	public Especialidade getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	


}

package packt.book.jee.eclipse.ch7.dto;

import java.io.Serializable;

public class PacienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idPaciente;

	
	private String contactoPaciente;

	
	private String moradaPaciente;


	private String nomePaciente;
	
	private String username;
	
	private String passwordUser;

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getContactoPaciente() {
		return this.contactoPaciente;
	}

	public void setContactoPaciente(String contactoPaciente) {
		this.contactoPaciente = contactoPaciente;
	}

	public String getMoradaPaciente() {
		return this.moradaPaciente;
	}

	public void setMoradaPaciente(String moradaPaciente) {
		this.moradaPaciente = moradaPaciente;
	}

	public String getNomePaciente() {
		return this.nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public String getPasswordUser() {
		return this.passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	
	
}

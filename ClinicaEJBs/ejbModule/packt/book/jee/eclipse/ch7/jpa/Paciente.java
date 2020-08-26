package packt.book.jee.eclipse.ch7.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the paciente database table.
 * 
 */
@Entity
@NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	private int idPaciente;

	@Column(name = "contacto_paciente")
	private String contactoPaciente;

	@Column(name = "morada_paciente")
	private String moradaPaciente;

	@Column(name = "nome_paciente")
	private String nomePaciente;

	@Column(name = "password_user")
	private String passwordUser;

	private String username;

	// bi-directional many-to-one association to Consulta
	@OneToMany(mappedBy = "paciente")
	private List<Consulta> consultas;

	public Paciente() {
	}

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

	public List<Consulta> getConsultas() {
		return this.consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Consulta addConsulta(Consulta consulta) {
		getConsultas().add(consulta);
		consulta.setPaciente(this);

		return consulta;
	}

	public Consulta removeConsulta(Consulta consulta) {
		getConsultas().remove(consulta);
		consulta.setPaciente(null);

		return consulta;
	}


}
package packt.book.jee.eclipse.ch7.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the medico database table.
 * 
 */
@Entity
@NamedQuery(name="Medico.findAll", query="SELECT m FROM Medico m")
public class Medico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_medico")
	private int idMedico;

	@Column(name="contacto_medico")
	private String contactoMedico;

	@Column(name="morada_medico")
	private String moradaMedico;

	@Column(name="nome_medico")
	private String nomeMedico;

	//bi-directional many-to-one association to Consulta
	@OneToMany(mappedBy="medico")
	private List<Consulta> consultas;

	//bi-directional many-to-one association to Especialidade
	@ManyToOne
	@JoinColumn(name="ref_id_espc")
	private Especialidade especialidade;

	public Medico() {
	}

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

	public List<Consulta> getConsultas() {
		return this.consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Consulta addConsulta(Consulta consulta) {
		getConsultas().add(consulta);
		consulta.setMedico(this);

		return consulta;
	}

	public Consulta removeConsulta(Consulta consulta) {
		getConsultas().remove(consulta);
		consulta.setMedico(null);

		return consulta;
	}

	public Especialidade getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}
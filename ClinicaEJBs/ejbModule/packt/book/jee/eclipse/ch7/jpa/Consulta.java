package packt.book.jee.eclipse.ch7.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the consulta database table.
 * 
 */
@Entity
@NamedQuery(name="Consulta.findAll", query="SELECT c FROM Consulta c")
public class Consulta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_consulta")
	private int idConsulta;

	@Column(name="data_consulta")
	private String dataConsulta;

	@Column(name="hora_consulta")
	private String horaConsulta;

	@Column(name="obs_consulta")
	private String obsConsulta;

	//bi-directional many-to-one association to Medico
	@ManyToOne
	@JoinColumn(name="ref_id_medico")
	private Medico medico;

	//bi-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="ref_id_paciente")
	private Paciente paciente;

	public Consulta() {
	}

	public int getIdConsulta() {
		return this.idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getDataConsulta() {
		return this.dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getHoraConsulta() {
		return this.horaConsulta;
	}

	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getObsConsulta() {
		return this.obsConsulta;
	}

	public void setObsConsulta(String obsConsulta) {
		this.obsConsulta = obsConsulta;
	}

	public Medico getMedico() {
		return this.medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
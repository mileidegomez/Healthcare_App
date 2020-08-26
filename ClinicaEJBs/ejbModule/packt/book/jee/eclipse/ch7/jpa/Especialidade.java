package packt.book.jee.eclipse.ch7.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the especialidade database table.
 * 
 */
@Entity
@NamedQuery(name="Especialidade.findAll", query="SELECT e FROM Especialidade e")
public class Especialidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_especialidade")
	private int idEspecialidade;

	@Column(name="nome_especialidade")
	private String nomeEspecialidade;

	//bi-directional many-to-one association to Medico
	@OneToMany(mappedBy="especialidade")
	private List<Medico> medicos;

	public Especialidade() {
	}

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

	public List<Medico> getMedicos() {
		return this.medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}

	public Medico addMedico(Medico medico) {
		getMedicos().add(medico);
		medico.setEspecialidade(this);

		return medico;
	}

	public Medico removeMedico(Medico medico) {
		getMedicos().remove(medico);
		medico.setEspecialidade(null);

		return medico;
	}

}
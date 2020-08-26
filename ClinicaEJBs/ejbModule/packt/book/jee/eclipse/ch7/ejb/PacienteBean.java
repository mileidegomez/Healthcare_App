package packt.book.jee.eclipse.ch7.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import packt.book.jee.eclipse.ch7.dto.PacienteDTO;
import packt.book.jee.eclipse.ch7.jpa.Paciente;

/**
 * Session Bean implementation class PacienteBean
 */
@Stateless
@LocalBean
public class PacienteBean implements PacienteBeanRemote {
	

	// O entity Manager maior parte das vezes é identificado como "em"
	
	@PersistenceContext
	EntityManager entityManager;

	public List<Paciente> getPacienteEntities() {
		
		TypedQuery<Paciente> pacienteQuery = entityManager.createNamedQuery("Paciente.findAll", Paciente.class);
		return pacienteQuery.getResultList();
	}

	
	public PacienteBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<PacienteDTO> getPaciente() {
		
		List<Paciente> pacienteEntities = getPacienteEntities();

		List<PacienteDTO> pacientes = new ArrayList<PacienteDTO>();
		
		for (Paciente pacienteEntity : pacienteEntities) {
			

			
			PacienteDTO paciente = new PacienteDTO();
			
			paciente.setIdPaciente(pacienteEntity.getIdPaciente());
			
			paciente.setContactoPaciente(pacienteEntity.getContactoPaciente());
			
			paciente.setMoradaPaciente(pacienteEntity.getMoradaPaciente());
			
			paciente.setNomePaciente(pacienteEntity.getNomePaciente());
			
			paciente.setPasswordUser(pacienteEntity.getPasswordUser());
			
			paciente.setUsername(pacienteEntity.getUsername());
			
			
			pacientes.add(paciente);
		}
		return pacientes;
		
		
		
		

	}
	

}

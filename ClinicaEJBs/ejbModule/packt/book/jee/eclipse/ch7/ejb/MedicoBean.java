package packt.book.jee.eclipse.ch7.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import packt.book.jee.eclipse.ch7.dto.MedicoDTO;
import packt.book.jee.eclipse.ch7.jpa.Medico;

/**
 * Session Bean implementation class MedicoBean
 */
@Stateless
@LocalBean
public class MedicoBean implements MedicoBeanRemote {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Medico> getMedicoEntities() {
		// Use named query created in Course entity using @NameQuery
		
		TypedQuery<Medico> medicoQuery = entityManager.createNamedQuery("Medico.findAll", Medico.class);
		
		return medicoQuery.getResultList();
	}


	
	
    public MedicoBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public List<MedicoDTO> getMedico() {
		// get course entities first
    	
		List<Medico> medicoEntities = getMedicoEntities();

		List<MedicoDTO> medicos = new ArrayList<MedicoDTO>();
		
		for (Medico medicoEntity : medicoEntities) {
			
			// Create CourseDTO from Course entity
			
			MedicoDTO medico = new MedicoDTO();
			
			
			medico.setIdMedico(medicoEntity.getIdMedico());	
			medico.setContactoMedico(medicoEntity.getContactoMedico());
			medico.setMoradaMedico(medicoEntity.getMoradaMedico());			
			medico.setNomeMedico(medicoEntity.getNomeMedico());
			medico.setEspecialidade(medicoEntity.getEspecialidade());
			medico.setnomeEspcMedico(medico.getnomeEspcMedico());
			//medico.setConsulta(medicoEntity.getConsulta());

			medicos.add(medico);
		}
		return medicos;

	}

}

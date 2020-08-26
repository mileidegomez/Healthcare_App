package packt.book.jee.eclipse.ch7.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import packt.book.jee.eclipse.ch7.dto.ConsultaDTO;
import packt.book.jee.eclipse.ch7.jpa.Consulta;
/**
 * Session Bean implementation class ConsultaBean
 */
@Stateless
@LocalBean
public class ConsultaBean implements ConsultaBeanRemote {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Consulta> getConsultaEntities() {
		// Use named query created in Course entity using @NameQuery
		
		TypedQuery<Consulta> consultaQuery = entityManager.createNamedQuery("Consulta.findAll", Consulta.class);
		
		return consultaQuery.getResultList();
	}

    public ConsultaBean() {
        
    }
    
    
  /* public List<PacienteDTO> getPacienteConsultaEntities(){
    	
	   TypedQuery<Consulta> consultaQuery = entityManager.createNamedQuery("Consulta.findAll", Consulta.class);
	   return consultaQuery.getResultList();
   }
    */
    
    	
	@Override
	public List<ConsultaDTO> getConsulta() {
		// get course entities first
    	
		List<Consulta> consultaEntities = getConsultaEntities();

		List<ConsultaDTO> consultas = new ArrayList<ConsultaDTO>();
		
		for (Consulta consultaEntity : consultaEntities) {
			
			// Create CourseDTO from Course entity
			
			ConsultaDTO consulta = new ConsultaDTO();
			
			
			consulta.setIdConsulta(consultaEntity.getIdConsulta());	
			consulta.setDataConsulta(consultaEntity.getDataConsulta());
			consulta.setHoraConsulta(consultaEntity.getHoraConsulta());			
			consulta.setObsConsulta(consultaEntity.getObsConsulta());			
			consulta.setMedico(consultaEntity.getMedico());			
			consulta.setPaciente(consultaEntity.getPaciente());
			consulta.setgetidPACconsulta(consulta.getidPACconsulta());
			consulta.setNOMEPACConsulta(consulta.getNOMEPACConsulta());
			consulta.setNOMEmedicoCOnsulta(consulta.getNOMEmedicoCOnsulta());
			consultas.add(consulta);
		}
		return consultas;

	}

}

package packt.book.jee.eclipse.ch7.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import packt.book.jee.eclipse.ch7.dto.EspecialidadeDTO;
import packt.book.jee.eclipse.ch7.jpa.Especialidade;

/**
 * Session Bean implementation class EspecialidadeBean
 */
@Stateless
@LocalBean
public class EspecialidadeBean implements EspecialidadeBeanRemote {
	
	
	@PersistenceContext
	EntityManager entityManager;

	public List<Especialidade> getEspecialidadeEntities() {
		// Use named query created in Course entity using @NameQuery
		TypedQuery<Especialidade> especialidadeQuery = entityManager.createNamedQuery("Especialidade.findAll", Especialidade.class);
		return especialidadeQuery.getResultList();
	}

	
    public EspecialidadeBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public List<EspecialidadeDTO> getEspecialidade() {
		
		List<Especialidade> especialidadeEntities = getEspecialidadeEntities();

		List<EspecialidadeDTO> especialidades = new ArrayList<EspecialidadeDTO>();
		
		for (Especialidade especialidadeEntity : especialidadeEntities) {
			
			
			EspecialidadeDTO especialidade = new EspecialidadeDTO();
			
			especialidade.setIdEspecialidade(especialidadeEntity.getIdEspecialidade());
			
			especialidade.setNomeEspecialidade(especialidadeEntity.getNomeEspecialidade());
			
			especialidades.add(especialidade);
		}
		return especialidades;
		
		
    }

}

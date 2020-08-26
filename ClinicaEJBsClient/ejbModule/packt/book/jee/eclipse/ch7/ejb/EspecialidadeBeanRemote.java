package packt.book.jee.eclipse.ch7.ejb;

import java.util.List;

import javax.ejb.Remote;

import packt.book.jee.eclipse.ch7.dto.EspecialidadeDTO;

@Remote
public interface EspecialidadeBeanRemote {
	
	public List<EspecialidadeDTO> getEspecialidade();
	
	
}

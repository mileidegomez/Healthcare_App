package packt.book.jee.eclipse.ch7.ejb;

import java.util.List;

import javax.ejb.Remote;

import packt.book.jee.eclipse.ch7.dto.MedicoDTO;

@Remote
public interface MedicoBeanRemote {
	
	public List<MedicoDTO> getMedico();

}

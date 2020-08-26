package packt.book.jee.eclipse.ch7.ejb;

import java.util.List;

import javax.ejb.Remote;

import packt.book.jee.eclipse.ch7.dto.ConsultaDTO;

@Remote
public interface ConsultaBeanRemote {
	
	public List<ConsultaDTO> getConsulta();

}

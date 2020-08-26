package packt.book.jee.eclipse.ch7.web.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import packt.book.jee.eclipse.ch7.dto.EspecialidadeDTO;
import packt.book.jee.eclipse.ch7.ejb.EspecialidadeBean;




@SuppressWarnings("deprecation")
@ManagedBean(name = "Especialidade")
public class EspecialidadeJSFBean {
	
	@EJB
	EspecialidadeBean especialidadeBean;
	
	public List<EspecialidadeDTO> getEspecialidade() {
		
		return especialidadeBean.getEspecialidade();
	}
}

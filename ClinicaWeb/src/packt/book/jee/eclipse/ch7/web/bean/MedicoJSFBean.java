package packt.book.jee.eclipse.ch7.web.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import packt.book.jee.eclipse.ch7.dto.MedicoDTO;
import packt.book.jee.eclipse.ch7.ejb.MedicoBean;

@SuppressWarnings("deprecation")
@ManagedBean(name = "Medico")

public class MedicoJSFBean {
	
	@EJB
	MedicoBean medicoBean;
	
	public List<MedicoDTO> getMedico() {
		return medicoBean.getMedico();
	}
	

}

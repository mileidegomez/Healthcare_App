package packt.book.jee.eclipse.ch7.web.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import packt.book.jee.eclipse.ch7.dto.ConsultaDTO;
import packt.book.jee.eclipse.ch7.ejb.ConsultaBean;



@SuppressWarnings("deprecation")
@ManagedBean(name = "Consulta")
public class ConsultaJSFBean {

	@EJB
	ConsultaBean consultaBean;
	
	public List<ConsultaDTO> getConsulta() {
		return consultaBean.getConsulta();
	}
	


}



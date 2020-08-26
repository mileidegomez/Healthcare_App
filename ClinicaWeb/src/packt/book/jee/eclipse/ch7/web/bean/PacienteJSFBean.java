package packt.book.jee.eclipse.ch7.web.bean;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;


import packt.book.jee.eclipse.ch7.dto.PacienteDTO;
//import packt.book.jee.eclipse.ch7.ejb.PacienteBean;
import packt.book.jee.eclipse.ch7.jpa.Paciente;
import packt.book.jee.eclipse.ch7.ejb.PacienteBeanRemote;

@SuppressWarnings("deprecation")
@ManagedBean(name = "Paciente")
public class PacienteJSFBean {
	@EJB
	PacienteBeanRemote pacienteBean;
	//@EJB
	//PacienteBean pacienteBean;
	
	public List<PacienteDTO> getPaciente() {
		return pacienteBean.getPaciente();
	}
	
	
	private Paciente um_paciente = new Paciente();
	
	public Paciente getumPaciente() {
		return um_paciente;
	}
	
	
}
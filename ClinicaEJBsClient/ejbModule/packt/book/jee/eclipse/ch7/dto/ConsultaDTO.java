package packt.book.jee.eclipse.ch7.dto;


import packt.book.jee.eclipse.ch7.jpa.*;
import java.io.Serializable;


public class ConsultaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idConsulta;
	
	private String dataConsulta;
	
	private String horaConsulta;
	
	private String obsConsulta;
	
	private Medico medico;
	
	private Paciente paciente;
	
	public int idpacienteconsulta;
	
	public String NOMEPACConsulta;
	
	public String NOMEmedicoCOnsulta;
	
	public String getNOMEPACConsulta() {
		Paciente pacienteconsulta = this.paciente;
		NOMEPACConsulta = pacienteconsulta.getNomePaciente();
		return NOMEPACConsulta;
	}
	
	public void setNOMEPACConsulta(String NOMEPACConsulta) {
		
		this.NOMEPACConsulta = NOMEPACConsulta;
	}
	
	public String getNOMEmedicoCOnsulta() {
		Medico medicoconsulta = this.medico;
		NOMEmedicoCOnsulta = medicoconsulta.getNomeMedico();
		return NOMEmedicoCOnsulta;
	}
	
	public void setNOMEmedicoCOnsulta(String NOMEmedicoCOnsulta) {
		
		this.NOMEmedicoCOnsulta = NOMEmedicoCOnsulta;
	}
	
	public int getidPACconsulta() {
		Paciente pacienteconsulta = this.paciente;
		idpacienteconsulta = pacienteconsulta.getIdPaciente();
		return idpacienteconsulta;
	}
	
	public void setgetidPACconsulta(int idpacienteconsulta) {
		this.idpacienteconsulta = idpacienteconsulta;
		
	}
	
	public int getIdConsulta() {
		return this.idConsulta;
	}
	
	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getDataConsulta() {
		return this.dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}


	public String getHoraConsulta() {
		return this.horaConsulta;
	}

	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getObsConsulta() {
		return this.obsConsulta;
	}

	public void setObsConsulta(String obsConsulta) {
		this.obsConsulta = obsConsulta;
	}
	 
	
	
	public Medico getMedico() {
		return this.medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}		
	

}

	
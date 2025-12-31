package br.com.trixti.toupeira.controller.estado;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.trixti.toupeira.to.EstadoTO;

@Named
@ViewScoped
public class EstadoController implements Serializable{

	private static final long serialVersionUID = 5430617414211565387L;

	private EstadoTO estadoTO;
	
	public void gravar() {
		System.out.println("testando se chegou");
	}

	public EstadoTO getEstadoTO() {
		return estadoTO;
	}

	public void setEstadoTO(EstadoTO estadoTO) {
		this.estadoTO = estadoTO;
	}

	
}

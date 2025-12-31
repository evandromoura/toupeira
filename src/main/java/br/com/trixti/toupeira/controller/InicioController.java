package br.com.trixti.toupeira.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.trixti.toupeira.to.InicioTO;

@Named
@ViewScoped
public class InicioController implements Serializable {

	private static final long serialVersionUID = -3550514688651583022L;

	private InicioTO inicioTO;

	
	public void gravar() {
		System.out.println("CHEGOU NO GRAVAR");
		System.out.println(getInicioTO().getNome());
	}
	
	
	public InicioTO getInicioTO() {
		if (inicioTO == null) {
			inicioTO = new InicioTO();
		}
		return inicioTO;
	}

	public void setInicioTO(InicioTO inicioTO) {
		this.inicioTO = inicioTO;
	}
	
	
	
	
	
}

package br.com.trixti.toupeira.controller.cidade;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.trixti.toupeira.to.CidadeTO;

@Named
@ViewScoped
public class CidadeController implements Serializable{

	private static final long serialVersionUID = 2946702392287173255L;

	private CidadeTO cidadeTO;
	
	public void gravar() {
		System.out.println("cheguemo cidade");
	}

	public CidadeTO getCidadeTO() {
		if (cidadeTO == null) {
			cidadeTO = new CidadeTO();
			
		}

		return cidadeTO;
	}

	public void setCidadeTO(CidadeTO cidadeTO) {
		this.cidadeTO = cidadeTO;
	}
	
	
}

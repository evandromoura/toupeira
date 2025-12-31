package br.com.trixti.toupeira.to;

import java.util.ArrayList;
import java.util.List;

import br.com.trixti.toupeira.entity.Estado;

public class EstadoTO {

	private Estado estado;
	private List<Estado> estados;

	public Estado getEstado() {
		if (estado == null) {
			estado = new Estado();
			
		}

		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Estado> getEstados() {
		if (estados == null) {
			estados = new ArrayList<Estado>();
			
		}

		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
	
	
	
}

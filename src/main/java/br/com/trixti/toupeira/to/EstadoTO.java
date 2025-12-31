package br.com.trixti.toupeira.to;

import br.com.trixti.toupeira.entity.Estado;

public class EstadoTO {

	private Estado estado;

	public Estado getEstado() {
		if (estado == null) {
			estado = new Estado();
			
		}

		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}

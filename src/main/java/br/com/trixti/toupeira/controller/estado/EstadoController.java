package br.com.trixti.toupeira.controller.estado;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.trixti.toupeira.entity.Estado;
import br.com.trixti.toupeira.service.estado.EstadoService;
import br.com.trixti.toupeira.to.EstadoTO;

@Named
@ViewScoped
public class EstadoController implements Serializable{

	private static final long serialVersionUID = 5430617414211565387L;

	private EstadoTO estadoTO;
	private @Inject EstadoService estadoService;
	
	@PostConstruct
	public void init() {
		inicializar();
	}
	
	public void inicializar() {
		getEstadoTO().setEstados(estadoService.list());
	}
	
	public void gravar() {
		System.out.println(getEstadoTO().getEstado().getNome());
		System.out.println(getEstadoTO().getEstado().getUf());
		estadoService.incluir(getEstadoTO().getEstado());
		getEstadoTO().setEstado(null);
	}

	public void excluir(Estado estado) {
		estadoService.excluir(estado);
		inicializar();
	}
	
	public EstadoTO getEstadoTO() {
		if (estadoTO == null) {
			estadoTO = new EstadoTO();
		}
		return estadoTO;
	}

	public void setEstadoTO(EstadoTO estadoTO) {
		this.estadoTO = estadoTO;
	}

	
}

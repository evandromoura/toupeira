package br.com.trixti.toupeira.service.combos;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.trixti.toupeira.entity.Cidade;
import br.com.trixti.toupeira.entity.Estado;
import br.com.trixti.toupeira.service.cidade.CidadeService;
import br.com.trixti.toupeira.service.estado.EstadoService;

@Named
public class CombosBean {
	
	private @Inject CidadeService cidadeService;
	private @Inject EstadoService estadoService;
	
	public List<Cidade> getCidades(){
		return cidadeService.list();
	}
	
	public List<Estado> getEstados(){
		return estadoService.list();
	}
}

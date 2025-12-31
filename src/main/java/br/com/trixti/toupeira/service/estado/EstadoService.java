package br.com.trixti.toupeira.service.estado;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.trixti.toupeira.dao.estado.EstadoDAO;
import br.com.trixti.toupeira.entity.Estado;

@Stateless
public class EstadoService {
	private @Inject EstadoDAO estadoDAO;
	
	public void incluir(Estado estado) {
		estadoDAO.incluir(estado);
	}
	
	public List<Estado> list(){
		return estadoDAO.list();
	}
	public void excluir(Estado estado) {
		estadoDAO.excluir(estado);
	}
}

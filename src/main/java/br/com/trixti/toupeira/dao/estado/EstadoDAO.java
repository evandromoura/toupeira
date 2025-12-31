package br.com.trixti.toupeira.dao.estado;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.trixti.toupeira.db.BD;
import br.com.trixti.toupeira.entity.Estado;

@Stateless
public class EstadoDAO {

	private @Inject BD bd;
	
	public void incluir(Estado estado) {
		bd.incluirEstado(estado);
	}

	public List<Estado> list(){
		return bd.getEstados();
	}
	public void excluir(Estado estado) {
		bd.excluirEstado(estado);
	}
}

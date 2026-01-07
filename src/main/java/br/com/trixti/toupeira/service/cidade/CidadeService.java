package br.com.trixti.toupeira.service.cidade;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.trixti.toupeira.dao.cidade.CidadeDAO;
import br.com.trixti.toupeira.entity.Cidade;

@Stateless
public class CidadeService {

	private @Inject CidadeDAO cidadeDAO;

	public void incluir(Cidade cidade) {
		cidadeDAO.incluir(cidade);
	}

	public List<Cidade> list() {
		return cidadeDAO.list();
	}

	public void excluir(Cidade cidade) {
		cidadeDAO.excluir(cidade);
	}
	
	public Cidade recuperarPorNome(String nome) {
		return cidadeDAO.recuperarPorNome(nome);
	}

}

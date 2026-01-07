package br.com.trixti.toupeira.dao.cidade;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.trixti.toupeira.db.BD;
import br.com.trixti.toupeira.entity.Cidade;

@Stateless
public class CidadeDAO {
	

	private @Inject BD bd;

	public void incluir(Cidade cidade) {
		bd.incluirCidade(cidade);
	}

	public List<Cidade> list() {
		return bd.getCidades();
	}

	public void excluir(Cidade cidade) {
		bd.excluirCidade(cidade);
	}

	public Cidade recuperarPorNome(String nome) {
		return bd.recuperarPorNome(nome);
	}
}

package br.com.trixti.toupeira.dao.pessoa;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.trixti.toupeira.db.BD;
import br.com.trixti.toupeira.entity.Pessoa;

@Stateless
public class PessoaDAO {

	
	private @Inject BD bd;
	
	public void incluir(Pessoa pessoa) {
		bd.incluirPessoa(pessoa);
	}

	public List<Pessoa> list() {
		return bd.getPessoas();
	}

	public void excluir(Pessoa pessoa) {
		bd.excluirPessoa(pessoa);
	}
}

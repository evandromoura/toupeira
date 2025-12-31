package br.com.trixti.toupeira.service.pessoa;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.trixti.toupeira.dao.pessoa.PessoaDAO;
import br.com.trixti.toupeira.entity.Pessoa;

@Stateless
public class PessoaService {

	private @Inject PessoaDAO pessoaDAO;
	
	public void incluir(Pessoa pessoa) {
		pessoaDAO.incluir(pessoa);
	}
	
	public List<Pessoa> list(){
		return pessoaDAO.list();
	}

	public void excluir(Pessoa pessoa) {

		pessoaDAO.excluir(pessoa);
	}
	
}

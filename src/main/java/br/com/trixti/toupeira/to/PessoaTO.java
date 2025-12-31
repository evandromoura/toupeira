package br.com.trixti.toupeira.to;

import java.util.ArrayList;
import java.util.List;

import br.com.trixti.toupeira.entity.Pessoa;

public class PessoaTO {

	private Pessoa pessoa;
	private List<Pessoa> pessoas;

	public Pessoa getPessoa() {
		if (pessoa == null) {
			pessoa = new Pessoa();
		}
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		if (pessoas == null) {
			pessoas = new ArrayList<Pessoa>();
		}
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
	
}

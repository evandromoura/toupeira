package br.com.trixti.toupeira.to;

import br.com.trixti.toupeira.entity.Pessoa;

public class PessoaTO {

	private Pessoa pessoa;

	public Pessoa getPessoa() {
		if (pessoa == null) {
			pessoa = new Pessoa();
		}
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}

package br.com.trixti.toupeira.to;

import br.com.trixti.toupeira.entity.Cidade;

public class CidadeTO {

	private Cidade cidade;

	public Cidade getCidade() {
		if (cidade == null) {
			cidade = new Cidade();	
		}

		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}

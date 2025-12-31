package br.com.trixti.toupeira.to;

import java.util.ArrayList;
import java.util.List;

import br.com.trixti.toupeira.entity.Cidade;

public class CidadeTO {

	private Cidade cidade;
	private List<Cidade> cidades;

	public Cidade getCidade() {
		if (cidade == null) {
			cidade = new Cidade();
		}
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getCidades() {
		if (cidades == null) {
			cidades = new ArrayList<Cidade>();
		}
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

}

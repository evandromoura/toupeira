package br.com.trixti.toupeira.db;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

import br.com.trixti.toupeira.entity.Cidade;
import br.com.trixti.toupeira.entity.Estado;
import br.com.trixti.toupeira.entity.Pessoa;

@Singleton
public class BD {
	
	private List<Pessoa> pessoas;
	private List<Estado> estados;
	private List<Cidade> cidades;
	
	public void incluirPessoa(Pessoa pessoa) {
		getPessoas().add(pessoa);
	}
	
	public void excluirPessoa(Pessoa pessoa) {
		getPessoas().remove(pessoa);
	}
	
	public void incluirCidade(Cidade cidade) {
		getCidades().add(cidade);
	}
	
	public void excluirCidade(Cidade cidade) {
		getCidades().remove(cidade);
	}
	
	public void incluirEstado(Estado estado) {
		getEstados().add(estado);
	}
	
	public void excluirEstado(Estado estado) {
		getEstados().remove(estado);
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
	
	public List<Estado> getEstados() {
		if (estados == null) {
			estados = new ArrayList<Estado>();
		}
		return estados;
	}
	
	public void setEstados(List<Estado> estados) {
		this.estados = estados;
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

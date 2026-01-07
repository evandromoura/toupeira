package br.com.trixti.toupeira.db;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

import br.com.trixti.toupeira.entity.Cidade;
import br.com.trixti.toupeira.entity.Estado;
import br.com.trixti.toupeira.entity.Pessoa;
import br.com.trixti.toupeira.entity.Usuario;

@Singleton
public class BD {
	
	private List<Pessoa> pessoas;
	private List<Estado> estados;
	private List<Cidade> cidades;
	private List<Usuario> usuarios;
	
	
	public void incluirUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
	}
	
	public void excluirUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
	}
	
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
	
	public Cidade recuperarPorNome(String nome) {
		return getCidades().stream().filter(cidade->cidade.getNome().equals(nome)).findFirst().get();
	}
	
	public Estado recuperarEstadoPorNome(String nome) {
		return getEstados().stream().filter(estado->estado.getNome().equals(nome)).findFirst().get();
	}
	
	public List<Usuario> getUsuarios() {
		if (usuarios == null) {
			usuarios = new ArrayList<Usuario>();
		}
		return usuarios;
	}
	
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
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

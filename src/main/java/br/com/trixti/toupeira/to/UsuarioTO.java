package br.com.trixti.toupeira.to;

import java.util.ArrayList;
import java.util.List;

import br.com.trixti.toupeira.entity.Usuario;

public class UsuarioTO {
	private Usuario usuario;
	private List<Usuario> usuarios;
	
	public Usuario getUsuario() {
		if (usuario == null) {
			usuario = new Usuario();
			
		}

		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	
}

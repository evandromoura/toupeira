package br.com.trixti.toupeira.controller.usuario;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.trixti.toupeira.entity.Usuario;
import br.com.trixti.toupeira.service.usuario.UsuarioService;
import br.com.trixti.toupeira.to.UsuarioTO;

/*
 * A anotação @ViewScoped em JavaServer Faces (JSF) mantém um bean gerenciável (como um ManagedBean ou backing bean)
 * ativo durante toda a vida de uma página (View), entre requisições
 
 * 
 * A anotação @Named serve para identificar e nomear beans (objetos gerenciados por um contêiner,
 *  como no CDI ou Spring) de forma explícita, especialmente quando há múltiplos beans do mesmo tipo (interface) e você precisa 
 *  dizer qual deles deve ser injetado em um ponto específico, usando um nome (qualificador) em vez do tipo padrão, facilitando 
 *  a Injeção de Dependência (DI) e o uso em linguagens de expressão (EL).
 * 
 * */

@Named
@ViewScoped
public class UsuarioController implements Serializable{
	
	private static final long serialVersionUID = -422498309668872991L;
	
	private UsuarioTO usuarioTO;
	private @Inject UsuarioService usuarioService;
	
	@PostConstruct
	private void init() {
		inicializar();
	}

	private void inicializar() {
		getUsuarioTO().setUsuarios(usuarioService.list());
	}

	public void gravar() {
		System.out.println(getUsuarioTO().getUsuario().getNomeUsuario());		
		System.out.println(getUsuarioTO().getUsuario().getSenhaUsuario());
		System.out.println(getUsuarioTO().getUsuario().getCidade());
		
		usuarioService.incluir(getUsuarioTO().getUsuario());
		getUsuarioTO().setUsuario(null);
	
	}
	
	public void excluir(Usuario usuario) {
		usuarioService.excluir(getUsuarioTO().getUsuario());
		inicializar();
	}
	
	public UsuarioTO getUsuarioTO() {
		if (usuarioTO == null) {
			usuarioTO = new UsuarioTO();
			
		}

		return usuarioTO;
	}

	public void setUsuarioTO(UsuarioTO usuarioTO) {
		this.usuarioTO = usuarioTO;
	}

	
	
}

package br.com.trixti.toupeira.service.usuario;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.trixti.toupeira.dao.usuario.UsuarioDAO;
import br.com.trixti.toupeira.entity.Usuario;

/*@Stateless define um Bean de Sessão sem Estado, 
 * indicando que o objeto não guarda dados específicos de um cliente entre requisições; 
 * cada chamada é tratada como nova e independente, permitindo alta escalabilidade e reuso do mesmo bean por múltiplos clientes
 * sendo gerenciado totalmente pelo contêiner*/

@Stateless
public class UsuarioService {

	private @Inject UsuarioDAO usuarioDAO;
	
	public List<Usuario> list(){
		return usuarioDAO.list();
	}
	public void incluir(Usuario usuario) {
		usuarioDAO.incluir(usuario);
	}
	public void excluir(Usuario usuario) {
		usuarioDAO.excluir(usuario);
	}
}

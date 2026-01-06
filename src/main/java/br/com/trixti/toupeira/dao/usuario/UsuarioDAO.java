package br.com.trixti.toupeira.dao.usuario;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.trixti.toupeira.db.BD;
import br.com.trixti.toupeira.entity.Usuario;

/*@Stateless, define um Bean de Sessão sem Estado, indicando que o objeto não guarda dados específicos de um cliente entre requisições;
 *  cada chamada é tratada como nova e independente
 * , permitindo alta escalabilidade e reuso do mesmo bean por múltiplos clientes
 * sendo gerenciado totalmente pelo contêiner
 * */

@Stateless
public class UsuarioDAO {

	private @Inject BD bd;
	
	//operacoes no  bd -> adicionar , exlcluir, listar
	
	public List<Usuario> list(){
		return bd.getUsuarios();
	}
	
	public void incluir(Usuario usuario) {
		bd.incluirUsuario(usuario);
	}
	public void excluir(Usuario usuario) {
		bd.excluirUsuario(usuario);
	}
}

package br.com.trixti.toupeira.controller.pessoa;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.trixti.toupeira.entity.Cidade;
import br.com.trixti.toupeira.entity.Estado;
import br.com.trixti.toupeira.entity.Pessoa;
import br.com.trixti.toupeira.service.cidade.CidadeService;
import br.com.trixti.toupeira.service.estado.EstadoService;
import br.com.trixti.toupeira.service.pessoa.PessoaService;
import br.com.trixti.toupeira.to.PessoaTO;

@Named
@ViewScoped
public class PessoaController implements Serializable {

	private static final long serialVersionUID = -3550514688651583022L;

	private PessoaTO pessoaTO;
	private @Inject PessoaService pessoaService;
	private @Inject CidadeService cidadeService;
	private @Inject EstadoService estadoService;

	@PostConstruct
	private void init() {
		System.out.println("Ëra para entrar aqui");
		inicializar();
	}

	private void inicializar() {
		getPessoaTO().setPessoas(pessoaService.list());
		getPessoaTO().getPessoa().setCidade(new Cidade());
		getPessoaTO().getPessoa().setEstado(new Estado());
	}

	public void gravar() {
		System.out.println(getPessoaTO().getPessoa().getNome());
		System.out.println(getPessoaTO().getPessoa().getEndereco());
		System.out.println(getPessoaTO().getPessoa().getIdade());
		System.out.println(getPessoaTO().getPessoa().getTelefone());
		comporPessoa();
		pessoaService.incluir(getPessoaTO().getPessoa());
		getPessoaTO().setPessoa(null);
		inicializar();
	}
	
	public void comporPessoa() {
		Cidade cidade = cidadeService.recuperarPorNome(getPessoaTO().getPessoa().getCidade().getNome());
		Estado estado = estadoService.recuperarEstadoPorNome(getPessoaTO().getPessoa().getEstado().getNome());
		getPessoaTO().getPessoa().setCidade(cidade);
		getPessoaTO().getPessoa().setEstado(estado);
	}

	public void excluir(Pessoa pessoa) {
		pessoaService.excluir(pessoa);
		inicializar();
	}

	public PessoaTO getPessoaTO() {
		if (pessoaTO == null) {
			pessoaTO = new PessoaTO();
		}
		return pessoaTO;
	}

	public void setPessoaTO(PessoaTO pessoaTO) {
		this.pessoaTO = pessoaTO;
	}

}
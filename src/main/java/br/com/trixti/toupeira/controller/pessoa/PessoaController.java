package br.com.trixti.toupeira.controller.pessoa;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.trixti.toupeira.entity.Pessoa;
import br.com.trixti.toupeira.service.pessoa.PessoaService;
import br.com.trixti.toupeira.to.PessoaTO;

@Named
@ViewScoped
public class PessoaController implements Serializable {

	private static final long serialVersionUID = -3550514688651583022L;

	private PessoaTO pessoaTO;
	private @Inject PessoaService pessoaService;

	@PostConstruct
	private void init() {
		System.out.println("Ëra para entrar aqui");
		inicializar();
	}

	private void inicializar() {
		getPessoaTO().setPessoas(pessoaService.list());
	}

	public void gravar() {
		System.out.println(getPessoaTO().getPessoa().getNome());
		System.out.println(getPessoaTO().getPessoa().getEndereco());
		System.out.println(getPessoaTO().getPessoa().getIdade());
		System.out.println(getPessoaTO().getPessoa().getTelefone());

		pessoaService.incluir(getPessoaTO().getPessoa());
		getPessoaTO().setPessoa(null);
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
package br.com.trixti.toupeira.controller.pessoa;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.trixti.toupeira.to.PessoaTO;


@Named
@ViewScoped
public class PessoaController implements Serializable {

	private static final long serialVersionUID = -3550514688651583022L;

	private PessoaTO pessoaTO;
	public void gravar() {
		System.out.println(getPessoaTO().getPessoa().getNome());
		System.out.println(getPessoaTO().getPessoa().getEndereco());
		System.out.println(getPessoaTO().getPessoa().getIdade());
		System.out.println(getPessoaTO().getPessoa().getTelefone());
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
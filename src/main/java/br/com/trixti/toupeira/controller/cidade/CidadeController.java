package br.com.trixti.toupeira.controller.cidade;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.trixti.toupeira.entity.Cidade;
import br.com.trixti.toupeira.entity.Pessoa;
import br.com.trixti.toupeira.service.cidade.CidadeService;
import br.com.trixti.toupeira.service.pessoa.PessoaService;
import br.com.trixti.toupeira.to.CidadeTO;
import br.com.trixti.toupeira.to.PessoaTO;

@Named
@ViewScoped
public class CidadeController implements Serializable {

	private static final long serialVersionUID = 2946702392287173255L;

	private CidadeTO cidadeTO;
	private @Inject CidadeService cidadeService;

	@PostConstruct
	private void init() {
		inicializar();
	}

	private void inicializar() {
		getCidadeTO().setCidades(cidadeService.list());
	}

	public void gravar() {
		System.out.println(getCidadeTO().getCidade().getNome());

		cidadeService.incluir(getCidadeTO().getCidade());
		getCidadeTO().setCidade(null);
	}

	public void excluir(Cidade cidade) {
		cidadeService.excluir(cidade);
		inicializar();
	}

	public CidadeTO getCidadeTO() {
		if (cidadeTO == null) {
			cidadeTO = new CidadeTO();

		}

		return cidadeTO;
	}

	public void setCidadeTO(CidadeTO cidadeTO) {
		this.cidadeTO = cidadeTO;
	}

}

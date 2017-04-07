package br.edu.unir.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.edu.unirn.Utils.MensagensUtils;
import br.edu.unirn.controller.PessoaController;
import br.edu.unirn.modelo.Pessoa;

@ManagedBean
public class PessoaBean {
	
	private Pessoa pessoa = new Pessoa();
	
	@EJB
	private PessoaController pc;
	
	public String cadastrar(){
		pc.cadastrar(pessoa);
		pessoa = new Pessoa();
		MensagensUtils.addInfo("Cliente alterado com sucesso!");
		return null;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}

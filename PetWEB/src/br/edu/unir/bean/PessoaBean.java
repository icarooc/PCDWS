package br.edu.unir.bean;

import java.util.List;

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
		if (pessoa.getId() <= 0){
			pc.cadastrar(pessoa);
			MensagensUtils.addInfo("Pessoa cadastrada com sucesso!");
		} else {
			pc.update(pessoa);
			MensagensUtils.addInfo("Pessoa alterada com sucesso!");
		}
		pessoa = new Pessoa();
		return null;
	}
	
	public String editar(Pessoa pessoa){
		this.pessoa = pessoa;
		return null;
	}
	
	public String excluir(Pessoa pessoa){
		this.pessoa = pessoa;
		pc.delete(this.pessoa);
		MensagensUtils.addInfo("Pessoa exclu�da com sucesso!");
		this.pessoa = new Pessoa();
		return null;
	}
	
	public List<Pessoa>getListaCompleta(){
		return pc.listaCompleta();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}

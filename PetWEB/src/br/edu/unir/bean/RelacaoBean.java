package br.edu.unir.bean;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.unirn.Utils.MensagensUtils;
import br.edu.unirn.controller.AnimalController;
import br.edu.unirn.controller.PessoaController;
import br.edu.unirn.controller.RelacaoController;
import br.edu.unirn.modelo.Animal;
import br.edu.unirn.modelo.Pessoa;
import br.edu.unirn.modelo.Relacao;

@ManagedBean
@SessionScoped
public class RelacaoBean {
	
	private Relacao relacao = new Relacao();
	
	@EJB
	private AnimalController ac;
	
	@EJB
	private PessoaController pc;
	
	@EJB
	private RelacaoController rc;
	
	@PostConstruct
	private void init(){
		relacao = new Relacao();
	}
	
	public String cadastrar(){
		if (relacao.getAnimal().getId() == 0 || relacao.getPessoa().getId() == 0){
			MensagensUtils.addError("É necessário informar uma pessoa e um animal.");
			return null;
		}
		relacao.setDataInicio(new Date());
		if (relacao.getId() <= 0){
			rc.cadastrarRelacao(relacao);
			MensagensUtils.addInfo("Relação cadastrada com sucesso!");
		} else {
			rc.update(relacao);
			MensagensUtils.addInfo("Relação alterada com sucesso!");
		}
		relacao = new Relacao();
		return null;
	}
	
	public String editar(Relacao relacao){
		this.relacao = relacao;
		return null;
	}
	
	public String excluir(Relacao relacao){
		this.relacao = relacao;
		rc.delete(this.relacao);
		MensagensUtils.addInfo("Relação excluída com sucesso!");
		this.relacao = new Relacao();
		return null;
	}
	
	public String cancelar(){
		this.relacao = new Relacao();
		return null;
	}
	
	public List<Relacao> getListaCompleta(){
		return rc.listaCompleta();
	}
	
	public List<Animal> getAnimaisSemDono(){
		List<Animal> animais = ac.buscarSemDonos();
		if (relacao.getId() > 0){
			animais.add(relacao.getAnimal());
		}
		return animais;
	}
	
	public List<Pessoa> getPessoas(){
		return pc.listaCompleta();
	}

	public Relacao getRelacao() {
		return relacao;
	}

	public void setRelacao(Relacao relacao) {
		this.relacao = relacao;
	}
}

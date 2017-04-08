package br.edu.unir.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.edu.unirn.Utils.MensagensUtils;
import br.edu.unirn.controller.AnimalController;
import br.edu.unirn.controller.RelacaoController;
import br.edu.unirn.modelo.Animal;

@ManagedBean
public class AnimalBean {
	
	private Animal animal = new Animal();
	
	@EJB
	private AnimalController ac;
	
	@EJB
	private RelacaoController rc;
	
	public String cadastrar(){
		if (animal.getId() <= 0){
			ac.cadastrarAnimal(animal);
			MensagensUtils.addInfo("Animal cadastrado com sucesso!");
		} else {
			ac.update(animal);
			MensagensUtils.addInfo("Animal alterado com sucesso!");
		}
		animal = new Animal();
		return null;
	}
	
	public String editar(Animal animal){
		this.animal = animal;
		return null;
	}
	
	public String excluir(Animal animal){
		this.animal = animal;
		List<Animal> animaisRelacionados = rc.buscarRelacaoPessoaAnimal(Animal.class, animal);
		if (animaisRelacionados == null || animaisRelacionados.isEmpty()) {
			ac.delete(this.animal);
			MensagensUtils.addInfo("Animal excluído com sucesso!");
		} else {
			MensagensUtils.addError("Não é possível excluir animal com relação cadastrada");
			return null;
		}
		this.animal = new Animal();
		return null;
	}
	
	public List<Animal>getListaCompleta(){
		return ac.listaCompleta();
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}

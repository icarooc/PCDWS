package br.edu.unirn.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.edu.unirn.dao.AnimalDao;
import br.edu.unirn.modelo.Animal;

@Stateless
@LocalBean
public class AnimalController extends AbstractController implements AnimalControllerLocal, AnimalControllerRemote {

	private AnimalDao animalDao;
	
	@PostConstruct
	public void init(){
		this.animalDao = new AnimalDao(getEm());
	}
	
	@Override
	public void cadastrarAnimal(Animal a) {
		animalDao.create(a);
		System.out.println(a.getId());
		System.out.println("Teste com sucesso");
	}
	
	@Override
	public void delete(Animal a){
		animalDao.delete(a);
	}

	@Override
	public void update(Animal a) {
		animalDao.update(a);
	}

	@Override
	public List<Animal> listaCompleta() {
		return animalDao.findAll();
	}

	@Override
	public List<Animal> buscarSemDonos() {
		return animalDao.buscarAnimaisSemDono();
	}

}

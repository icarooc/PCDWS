package br.edu.unirn.controller;

import java.util.List;

import javax.ejb.Remote;

import br.edu.unirn.modelo.Animal;
import br.edu.unirn.modelo.Pessoa;

@Remote
public interface AnimalControllerRemote {
	
	public void cadastrarAnimal(Animal a);
	
	public void update(Animal a);
		
	public void delete(Animal a);
	
	public List<Animal> listaCompleta();
	
	public List<Animal> buscarSemDonos();

}

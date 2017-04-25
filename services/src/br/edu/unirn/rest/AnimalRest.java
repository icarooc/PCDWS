package br.edu.unirn.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.edu.unirn.controller.AnimalController;
import br.edu.unirn.modelo.Animal;

@Path("/animal")
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class AnimalRest {
	
	@EJB
	AnimalController ac;
	
	//GET
	@GET
	public List<Animal> getAll(){
		return ac.listaCompleta();
	}
	
	//POST
	@POST
	public Animal criar(Animal animal){
		ac.cadastrarAnimal(animal);
		return animal;
	}
	
	//PUT
	@PUT
	public Animal alterar(Animal animal) {
		ac.update(animal);
		return animal;
	}

	// DELETE
	@DELETE
	public Response remover(Animal a) {
		ac.delete(a);
		return Response.status(200).build();
	}

}

package br.edu.unirn.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.edu.unirn.controller.PessoaController;
import br.edu.unirn.modelo.Pessoa;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class PessoaRest {
	
	@EJB
	PessoaController pc;
	
	//GET
	@GET
	public List<Pessoa> getAll(){
		return pc.listaCompleta();
	}
	
	//GET/ID
	@GET
	@Path("{id}")
	public Response get(@PathParam("id") Long id) {
		Pessoa p = pc.findByID(id);
		return Response.status(200).entity(p).build();
	}
	
	//POST
	@POST
	public Pessoa criar(Pessoa pessoa){
		pc.cadastrar(pessoa);
		return pessoa;
	}

	//PUT
	@PUT
	public Pessoa alterar(Pessoa pessoa) {
		pc.update(pessoa);
		return pessoa;
	}
	
	//DELETE
	@DELETE
	public Response remover(Pessoa p) {
		pc.delete(p);
		return Response.status(200).build();
	}

}

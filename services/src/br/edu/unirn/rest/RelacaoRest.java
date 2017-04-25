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

import br.edu.unirn.controller.RelacaoController;
import br.edu.unirn.modelo.Relacao;

@Path("/relacao")
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class RelacaoRest {
	
	@EJB
	RelacaoController rc;
	
	//GET
	@GET
	public List<Relacao> getAll(){
		return rc.listaCompleta();
	}
	
	//POST
	@POST
	public Relacao criar(Relacao relacao){
		rc.cadastrarRelacao(relacao);
		return relacao;
	}
	
	//PUT
	@PUT
	public Relacao alterar(Relacao relacao) {
		rc.update(relacao);
		return relacao;
	}

	//DELETE
	@DELETE
	public Response remover(Relacao r) {
		rc.delete(r);
		return Response.status(200).build();
	}

}

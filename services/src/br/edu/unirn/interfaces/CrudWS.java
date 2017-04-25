package br.edu.unirn.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.edu.unirn.modelo.Animal;
import br.edu.unirn.modelo.Pessoa;
import br.edu.unirn.modelo.Relacao;

@WebService
public interface CrudWS {
	
	@WebMethod
	public void updatePessoa(Pessoa p);
	
	@WebMethod
	public void cadastrarPessoa(Pessoa p);
	
	@WebMethod
	public void deletePessoa(Pessoa p);
	
	@WebMethod
	public List<Pessoa> listaCompletaPessoa();
	
	@WebMethod
	public void cadastrarAnimal(Animal a);
	
	@WebMethod
	public void updateAnimal(Animal a);
	
	@WebMethod		
	public void deleteAnimal(Animal a);
	
	@WebMethod
	public List<Animal> listaCompletaAnimal();
	
	@WebMethod
	public void cadastrarRelacao(Relacao r);
	
	@WebMethod
	public void updateRelacao(Relacao r);
		
	@WebMethod
	public void deleteRelacao(Relacao r);
	
	@WebMethod
	public List<Relacao> listaCompletaRelacao();
	

}

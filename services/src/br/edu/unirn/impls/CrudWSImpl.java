package br.edu.unirn.impls;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import br.edu.unirn.controller.AnimalController;
import br.edu.unirn.controller.PessoaController;
import br.edu.unirn.controller.RelacaoController;
import br.edu.unirn.interfaces.CrudWS;
import br.edu.unirn.modelo.Animal;
import br.edu.unirn.modelo.Pessoa;
import br.edu.unirn.modelo.Relacao;

@WebService(serviceName = "WServices")
public class CrudWSImpl implements CrudWS {
	
	@EJB
	private PessoaController pc;
	
	@EJB
	private RelacaoController rc;
	
	@EJB
	private AnimalController ac;

	@Override
	public void updatePessoa(Pessoa p) {
		
		pc.update(p);

	}

	@Override
	public void cadastrarPessoa(Pessoa p) {
		
		pc.cadastrar(p);

	}

	@Override
	public void deletePessoa(Pessoa p) {
		
		pc.delete(p);

	}

	@Override
	public List<Pessoa> listaCompletaPessoa() {
		
		return pc.listaCompleta();
		
	}

	@Override
	public void cadastrarAnimal(Animal a) {
		
		ac.cadastrarAnimal(a);

	}

	@Override
	public void updateAnimal(Animal a) {
		
		ac.update(a);

	}

	@Override
	public void deleteAnimal(Animal a) {
		
		ac.delete(a);

	}

	@Override
	public List<Animal> listaCompletaAnimal() {
		
		return ac.listaCompleta();
		
	}

	@Override
	public void cadastrarRelacao(Relacao r) {
		
		rc.cadastrarRelacao(r);

	}

	@Override
	public void updateRelacao(Relacao r) {
		
		rc.update(r);

	}

	@Override
	public void deleteRelacao(Relacao r) {
		
		rc.delete(r);

	}

	@Override
	public List<Relacao> listaCompletaRelacao() {
		
		return rc.listaCompleta();
		
	}

}

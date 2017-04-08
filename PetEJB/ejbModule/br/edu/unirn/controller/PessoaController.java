package br.edu.unirn.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.unirn.dao.PessoaDao;
import br.edu.unirn.modelo.Pessoa;

/**
 * Session Bean implementation class PessoaController
 */
@Stateless
@LocalBean
public class PessoaController extends AbstractController implements PessoaControllerLocal, PessoaControllerRemote {

	private PessoaDao pessoaDao;
	
	@PostConstruct
	public void init(){
		this.pessoaDao = new PessoaDao(getEm());
	}
	
	@Override
	public void cadastrar(Pessoa p) {
		pessoaDao.create(p);
		System.out.println(p.getId());
		System.out.println("Teste com sucesso");
	}
	
	@Override
	public void delete(Pessoa p){
		pessoaDao.delete(p);
	}

	@Override
	public void update(Pessoa p) {
		pessoaDao.update(p);
	}

	@Override
	public List<Pessoa> listaCompleta() {
		return pessoaDao.findAll();
	}

}

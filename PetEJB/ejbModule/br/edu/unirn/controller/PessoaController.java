package br.edu.unirn.controller;

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
public class PessoaController implements PessoaControllerLocal, PessoaControllerRemote {

	@PersistenceContext(unitName="PetBDDS")
	EntityManager em;

	private PessoaDao pessoaDao;
	
	@PostConstruct
	public void init(){
		this.pessoaDao = new PessoaDao(em);
	}
	
	@Override
	public void cadastrar(String nome, String telefone) {
		Pessoa p = new Pessoa();
		p.setCpf("00000000000");
		p.setEndereco("Endereço teste");
		p.setIdade(21);
		p.setNome("Fulano Sicrano");
		p.setTelefone("84981237777");
		pessoaDao.create(p);
		System.out.println("Teste com sucesso");

	}

}

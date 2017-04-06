package br.edu.unirn.dao;

import javax.persistence.EntityManager;

import br.edu.unirn.modelo.Pessoa;

public class PessoaDao extends GenericDao<Pessoa> {
	
	EntityManager entityManager;
	
	public PessoaDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public Class<Pessoa> getClassType() {
		return Pessoa.class;
	}
	
	@Override
	public EntityManager getEm() {
		return entityManager;
	}

}

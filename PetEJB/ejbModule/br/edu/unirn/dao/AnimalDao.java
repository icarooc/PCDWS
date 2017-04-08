package br.edu.unirn.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.unirn.modelo.Animal;

public class AnimalDao extends GenericDao<Animal> {
	
	EntityManager entityManager;
	
	public AnimalDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public Class<Animal> getClassType() {
		return Animal.class;
	}
	
	@Override
	public EntityManager getEm() {
		return entityManager;
	}
	
	public List<Animal> buscarAnimaisSemDono(){
		String jpql = "SELECT a FROM Animal a WHERE NOT EXISTS (SELECT r FROM Relacao r WHERE r.animal.id = a.id)";
		EntityManager em = getEm();
		Query q = em.createQuery(jpql);
		List<Animal> retorno = q.getResultList();
		return retorno;
	}

}

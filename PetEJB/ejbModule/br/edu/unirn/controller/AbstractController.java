package br.edu.unirn.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractController {
	
	@PersistenceContext(unitName="PetBDDS")
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

}

package br.edu.unirn.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.unirn.modelo.PersistDB;
import br.edu.unirn.modelo.Relacao;

public class RelacaoDao extends GenericDao<Relacao>{

	EntityManager entityManager;
	
	public RelacaoDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public EntityManager getEm() {
		return this.entityManager;
	}

	@Override
	public Class<Relacao> getClassType() {
		return Relacao.class;
	}
	
	public <T extends PersistDB> List<T> buscarRelacaoPessoaAnimal(Class<T> t, T objeto) {
		String tabela = t.getSimpleName();
		String jpql = "SELECT r FROM Relacao r where r." + tabela + ".id like :valor";
		EntityManager em = getEm();
		Query q = em.createQuery(jpql);
		q.setParameter("valor", "%"+objeto.getId()+"%");
		List<T> retorno = q.getResultList();
		return retorno;
	}

}

package br.edu.unirn.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import br.edu.unirn.dao.RelacaoDao;
import br.edu.unirn.modelo.PersistDB;
import br.edu.unirn.modelo.Relacao;

public class RelacaoController extends AbstractController implements RelacaoControllerRemote,RelacaoControllerLocal {

	private RelacaoDao relacaoDao;
	
	@PostConstruct
	public void init(){
		this.relacaoDao = new RelacaoDao(getEm());
	}
	
	@Override
	public void cadastrarRelacao(Relacao r) {
		relacaoDao.create(r);
	}

	@Override
	public void update(Relacao r) {
		relacaoDao.update(r);
	}

	@Override
	public void delete(Relacao r) {
		relacaoDao.delete(r);
	}

	@Override
	public List<Relacao> listaCompleta() {
		return relacaoDao.findAll();
	}

	@Override
	public <T extends PersistDB> List<T> buscarRelacaoPessoaAnimal(Class<T> t, T objeto) {
		return relacaoDao.buscarRelacaoPessoaAnimal(t, objeto);
	}

}

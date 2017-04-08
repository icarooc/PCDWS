package br.edu.unirn.controller;

import java.util.List;

import javax.ejb.Remote;

import br.edu.unirn.modelo.PersistDB;
import br.edu.unirn.modelo.Relacao;

@Remote
public interface RelacaoControllerRemote {
	
	public void cadastrarRelacao(Relacao r);
	
	public void update(Relacao r);
		
	public void delete(Relacao r);
	
	public List<Relacao> listaCompleta();
	
	public <T extends PersistDB> List<T> buscarRelacaoPessoaAnimal(Class<T> t, T objeto);

}

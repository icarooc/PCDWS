package br.edu.unirn.controller;

import java.util.List;

import javax.ejb.Remote;

import br.edu.unirn.modelo.Pessoa;

@Remote
public interface PessoaControllerRemote {
	
	public void update(Pessoa p);
	
	public void cadastrar(Pessoa p);
	
	public void delete(Pessoa p);
	
	public List<Pessoa> listaCompleta();
	
	public Pessoa findByID(Long id);

}

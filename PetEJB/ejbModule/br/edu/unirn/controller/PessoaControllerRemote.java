package br.edu.unirn.controller;

import javax.ejb.Remote;

import br.edu.unirn.modelo.Pessoa;

@Remote
public interface PessoaControllerRemote {
	
	public void cadastrar(Pessoa p);

}

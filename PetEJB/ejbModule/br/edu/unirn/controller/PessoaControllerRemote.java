package br.edu.unirn.controller;

import javax.ejb.Remote;

@Remote
public interface PessoaControllerRemote {
	
	public void cadastrar(String nome, String telefone);

}

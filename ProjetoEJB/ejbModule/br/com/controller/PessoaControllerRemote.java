package br.com.controller;

import javax.ejb.Remote;

@Remote
public interface PessoaControllerRemote {
	
	public void cadastrar(String nome, String telefone);

}

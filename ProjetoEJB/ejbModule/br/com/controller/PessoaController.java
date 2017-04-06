package br.com.controller;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class PessoaController
 */
@Stateless
@LocalBean
public class PessoaController implements PessoaControllerRemote, PessoaControllerLocal {

    /**
     * Default constructor. 
     */
    public PessoaController() {
        // TODO Auto-generated constructor stub
    }
    
    public void cadastrar(String nome, String telefone){
    	System.out.println("Nome: " + nome + " telefone: " + telefone);
    }

}

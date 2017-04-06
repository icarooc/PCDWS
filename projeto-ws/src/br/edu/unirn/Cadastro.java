package br.edu.unirn;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.edu.unirn.model.Pessoa;

@WebService
public interface Cadastro {
	
	@WebMethod
	public String work(String mensagem);
	
	@WebMethod
	public Pessoa cadastrar(Pessoa pessoa);
	
	@WebMethod
	public Pessoa recuperar(int pos);
	
	@WebMethod
	public List<Pessoa> listar();

}

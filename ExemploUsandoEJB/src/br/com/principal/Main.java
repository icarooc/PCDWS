package br.com.principal;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.controller.PessoaControllerRemote;

public class Main {

	public static void main(String[] args) throws NamingException {
		
		Hashtable<String, Object> t = new Hashtable<String,Object>();
		t.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.jboss.naming.remote.client.InitialContextFactory");
		t.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		t.put("jboss.naming.client.ejb.context", true);
		
		Context ic = new InitialContext(t);
		PessoaControllerRemote p = (PessoaControllerRemote) 
									ic.lookup("ProjetoEAR/ProjetoEJB/PessoaController!br.com.controller.PessoaControllerRemote");
		p.cadastrar("Icaro", "988291708");

	}

}

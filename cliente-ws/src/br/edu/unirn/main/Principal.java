package br.edu.unirn.main;

import java.util.List;

import br.edu.unirn.Pessoa;
import br.edu.unirn.impl.Cadastro;
import br.edu.unirn.impl.CadastroService;

public class Principal {

	public static void main(String[] args) {
		
		CadastroService service = new CadastroService();
		Cadastro cadastro = service.getCadastroImplPort();
		cadastro.work("Deu certo!!");
		
		Pessoa p = new Pessoa();
		p.setName("Icaro");
		p.setAltura(176);
		p.setIdade(26);
		
		cadastro.cadastrar(p);
		
		List<Pessoa> lista = cadastro.listar();
		for (Pessoa pes : lista){
			System.out.println(pes.getName());
		}

	}

}

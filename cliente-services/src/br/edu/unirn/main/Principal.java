package br.edu.unirn.main;

import java.util.List;

import br.edu.unirn.impls.CrudWS;
import br.edu.unirn.impls.WServices;
import br.edu.unirn.interfaces.Animal;
import br.edu.unirn.interfaces.Pessoa;
import br.edu.unirn.interfaces.Relacao;

public class Principal {

	public static void main(String[] args) {
		
		WServices service = new WServices();
		CrudWS servico = service.getCrudWSImplPort();
		
		Pessoa p = new Pessoa();
		p.setNome("Sicrano");
		p.setCpf("123.456.789-00");
		p.setIdade(26);
		p.setEndereco("Testando Endereço");
		p.setTelefone("(84)987777777");
		
		//servico.deletePessoa(p);
		
		//p.setId(0);
		
		//servico.cadastrarPessoa(p);
		
		//p.setNome("Sicrano 2");
		
		//servico.updatePessoa(p);
		
		System.out.println("---------Pessoas:");
		List<Pessoa> lista = servico.listaCompletaPessoa();
		for (Pessoa pes : lista){
			System.out.println(pes.getNome());
		}
		
		System.out.println("---------Animais:");
		List<Animal> listaAnimais = servico.listaCompletaAnimal();
		for (Animal a : listaAnimais){
			System.out.println(a.getNome());
		}
		
		System.out.println("---------Relações:");
		List<Relacao> listaRelacoes = servico.listaCompletaRelacao();
		for (Relacao r : listaRelacoes){
			System.out.println(r.getDataInicio());
		}

	}

}

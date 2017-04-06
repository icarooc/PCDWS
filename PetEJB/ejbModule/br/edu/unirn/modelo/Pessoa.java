package br.edu.unirn.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class Pessoa implements PersistDB{
	
	@Id
	@GeneratedValue(generator="pessoa_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="pessoa_seq",sequenceName="pessoa_seq")
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private int idade;
	
	@Column
	private String cpf;
	
	@Column
	private String telefone;
	
	@Column
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

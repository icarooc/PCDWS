package br.edu.unirn.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class Animal implements PersistDB{
	
	@Id
	@GeneratedValue(generator="animal_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="animal_seq",sequenceName="animal_seq")
	private int id;
	
	@Column
	private String tipo;
	
	@Column
	private int idade;
	
	@Column
	private String nome;
	
	@Column
	private String raca;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}

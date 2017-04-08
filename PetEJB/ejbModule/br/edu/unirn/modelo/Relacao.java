package br.edu.unirn.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="relacao")
public class Relacao implements PersistDB{
	
	@Id
	@GeneratedValue(generator="relacao_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="relacao_seq",sequenceName="relacao_seq")
	private int id;
	
	@OneToOne
	@JoinColumn(name="id_animal")
	private Animal animal = new Animal();
	
	@OneToOne
	@JoinColumn(name="id_pessoa")
	private Pessoa pessoa = new Pessoa();
	
	@Column
	private Date dataInicio;
	
	@Column
	private Date dataFim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}

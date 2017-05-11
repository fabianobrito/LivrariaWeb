package br.org.indt.Models.Entitys;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Livros {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long isbn;

	@Column
	private String titulo;

	@OneToMany
	private Editoras Editoras;

	@OneToMany
	private Categorias categorias;
	
	@ManyToMany
	@JoinTable(name = "livrosautores", 
	joinColumns = @JoinColumn(name = "AutorId"), 
	inverseJoinColumns = @JoinColumn(name = "AutorId"))
	private List<Autores> autores;

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Editoras getEditoras() {
		return Editoras;
	}

	public void setEditoras(Editoras editoras) {
		Editoras = editoras;
	}

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	public List<Autores> getAutores() {
		return autores;
	}

	public void setAutores(List<Autores> autores) {
		this.autores = autores;
	}
}
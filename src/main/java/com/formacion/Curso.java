package com.formacion;

public class Curso {
	private Integer id;
	private String nombre;
	private String descripcion;
	private Profesor profesor;
	
	public Curso(Integer id, String nombre, String descripcion, Profesor profesor) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.profesor = profesor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
	
}

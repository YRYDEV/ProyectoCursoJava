package com.ipartek.modelo.dto;

public class Recetas{

	private int id; 	
	private String nombre;
	private int FK_dificultad;
	
	public Recetas(int recetasId, String nombre, int recetasFkDificultad) {
		super();
		this.id = recetasId;
		this.nombre = nombre;
		FK_dificultad = recetasFkDificultad;
	}
	
	public Recetas() {
		super();
		this.id = 0;
		this.nombre = "";
		FK_dificultad = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFK_dificultad() {
		return FK_dificultad;
	}

	public void setFK_dificultad(int fK_dificultad) {
		FK_dificultad = fK_dificultad;
	}

	@Override
	public String toString() {
		return "Recetas [id=" + id + ", nombre=" + nombre + ", FK_dificultad=" + FK_dificultad + "]";
	}
	
	
}

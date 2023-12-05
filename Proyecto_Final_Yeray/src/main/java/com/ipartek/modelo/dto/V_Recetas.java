package com.ipartek.modelo.dto;

public class V_Recetas {

	private int id; 	
	private String nombre;
	private int FK_dificultad;
	private String dificultad;
	
	public V_Recetas(int id, String nombre, int fK_dificultad, String dificultad) {
		super();
		this.id = id;
		this.nombre = nombre;
		FK_dificultad = fK_dificultad;
		this.dificultad = dificultad;
	}
	public V_Recetas() {
		super();
		this.id = 0;
		this.nombre = "";
		FK_dificultad = 0;
		this.dificultad = "";
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
	public String getDificultad() {
		return dificultad;
	}
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	@Override
	public String toString() {
		return "V_Recetas [id=" + id + ", nombre=" + nombre + ", FK_dificultad=" + FK_dificultad + ", dificultad="
				+ dificultad + "]";
	}
	
	

	
}

package com.ipartek.modelo.dto;

public class Dificultades {

	private int id;
	private String dificultad;
	
	public Dificultades(int id, String dificultad) {
		super();
		this.id = id;
		this.dificultad = dificultad;
	}
	
	public Dificultades() {
		super();
		this.id = 0;
		this.dificultad = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	@Override
	public String toString() {
		return "Dificultades [id=" + id + ", dificultad=" + dificultad + "]";
	}
	
	
	
}
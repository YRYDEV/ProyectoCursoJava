package com.ipartek.modelo;

import java.sql.Connection;

import com.ipartek.modelo.dto.Recetas;

public interface DAO_Metodos {

	Connection conectar();
	void desconectar(Connection con);
	void insertareceta(Connection con, Recetas recetas);
}

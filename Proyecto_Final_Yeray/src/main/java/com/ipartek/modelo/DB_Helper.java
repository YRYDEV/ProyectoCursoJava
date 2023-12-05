package com.ipartek.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.modelo.dto.Dificultades;
import com.ipartek.modelo.dto.Recetas;
import com.ipartek.modelo.dto.V_Recetas;

public class DB_Helper implements DAO_Constantes, DAO_Metodos {

	@Override
	public Connection conectar() {
		Connection con = null;

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION, USUARIO, PASS);
			System.out.println("BASE DE DATOS CONECTADA");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL DRIVER");
		} catch (SQLException e) {
			System.out.println("ERROR AL CONECTAR A LA BD");
		}

		return con;
	}
	@Override
	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("BASE DE DATOS DESCONECTADA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
	}
	
	@Override
	public void insertareceta (Connection con, Recetas recetas) {
		try {
			CallableStatement cStmt = con.prepareCall(SP_INSERTAR_RECETA);
			cStmt.setString(1, recetas.getNombre());
			cStmt.setInt(2, recetas.getFK_dificultad());
			
			cStmt.execute();
			
			System.out.println("SE INSERTO LA RECETA CORRECTAMENTE");
			
			}catch (SQLException e) {
				System.out.println("NO SE PUDO INSERTAR LA RECETA");
				e.printStackTrace();
			}

		}
	public List<V_Recetas> mostrarreceta(Connection con) {
		
		List<V_Recetas> lista = new ArrayList<V_Recetas>();
		
		try {
			CallableStatement cStmt = con.prepareCall(SP_MOSTRAR_RECETAS);
			
			cStmt.execute();

			ResultSet rs = cStmt.getResultSet();
			
			while(rs.next()) {
				V_Recetas receta=new V_Recetas();
				
				receta.setId(rs.getInt(V_RECETA_ID));
				receta.setNombre(rs.getString(V_RECETA_NOMBRE));
				receta.setFK_dificultad(rs.getInt(V_RECETA_FK_Dificultad));
				receta.setDificultad(rs.getString(V_RECETA_DIFICULTDAD));
				
				lista.add(receta);
			}
			System.out.println("LISTA DE TODAS LAS RECETAS OBTENIDA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO OBTENER LA LISTA DE TODAS LAS RECETAS");
			e.printStackTrace();
			return new ArrayList<V_Recetas>();
		}
		return lista;

		
		
	
		
	}
	public List<Dificultades> obtenerdificultades(Connection con) {
		List<Dificultades>listadificultades = new ArrayList<Dificultades>();
		
		try {
			CallableStatement cStmt=con.prepareCall(SP_MOSTRAR_DIFICULTADES);
			
			cStmt.execute();
			
			ResultSet rs = cStmt.getResultSet();
			
			while(rs.next()) {
				Dificultades dificultad = new Dificultades();
				
				dificultad.setId(rs.getInt(DIFICULTADES_ID));
				dificultad.setDificultad(rs.getString(DIFICULTADES_DIFICULTAD));
				
				listadificultades.add(dificultad);
			}
			System.out.println("LISTA DE TODAS LAS DIFICULTADES OBTENIDA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO OBTENER LA LISTA DE TODAS LAS DIFICULTADES");
			e.printStackTrace();
			return new ArrayList<Dificultades>();
		}
		
	return listadificultades;
		
	}
	
	
	
		
	
}

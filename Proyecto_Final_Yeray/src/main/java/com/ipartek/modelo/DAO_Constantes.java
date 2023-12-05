package com.ipartek.modelo;

public interface DAO_Constantes {

	// cadenas de conexion
	String BASE_DATOS = "bd_proyecto_final_yeray";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/" + BASE_DATOS;
	String USUARIO = "usr_recetas";
	String PASS = "1234";
	
	// archivos JSP
	String JSP_INICIO= "inicio.jsp";
	String JSP_INSERTAR= "insertar.jsp";
	String JSP_MOSTRAR= "mostrar.jsp";
	
	// constantes de tablas y vistas
	String TABLA_RECETAS="recetas";
	String RECETAS_ID="id";
	String RECETAS_NOMBRE="nombre";
	String RECETAS_FK_dificultad="FK_dificultad";
	
	String TABLA_DIFICULTADES="dificultades";
	String DIFICULTADES_ID="id";
	String DIFICULTADES_DIFICULTAD="dificultad";
	
	String V_VERTODASLASRECETAS="v_todaslasrecetas";
	String V_RECETA_ID="id";
	String V_RECETA_NOMBRE="nombre";
	String V_RECETA_FK_Dificultad="FK_dificultad";
	String V_RECETA_DIFICULTDAD= "dificultad";
	
	//constantes de los procedimientos	
	String SP_MOSTRAR_RECETAS="call sp_mostrarrecetas()";	
	String SP_INSERTAR_RECETA="call sp_InsertarReceta(?,?)";
	String SP_MOSTRAR_DIFICULTADES="call sp_mostrar_dificultades()";
	
	//constantes de Atributos 
	String ATR_LISTA_RECETAS="atr_lista_recetas";
	String ATR_DIFICULTAD_RECETAS="atr_dificultad_recetas";
			
			
}

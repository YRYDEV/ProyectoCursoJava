package com.ipartek.menu;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.modelo.DAO_Constantes;
import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.dto.Recetas;
import com.ipartek.modelo.dto.V_Recetas;

/**
 * Servlet implementation class Mostrarrecetas
 */
@WebServlet("/CargarReceta")
public class CargarReceta extends HttpServlet implements DAO_Constantes {
	private static final long serialVersionUID = 1L;

	public CargarReceta() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1
	
		// 2

		

		// 3
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();

		// 4
		

		List<V_Recetas> listaRecetas = db.mostrarreceta(con);
		System.out.println(listaRecetas);
		// 5
		db.desconectar(con);

		// 6
		request.setAttribute(ATR_LISTA_RECETAS, listaRecetas);
		
		// 7
		request.getRequestDispatcher(JSP_MOSTRAR).forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

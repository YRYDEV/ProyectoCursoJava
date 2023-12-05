package com.ipartek.menu;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.modelo.DAO_Constantes;
import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.dto.Recetas;

/**
 * Servlet implementation class Insertar
 */
@WebServlet("/Insertar")
public class Insertar extends HttpServlet implements DAO_Constantes {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insertar() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1
				String nombre="";
				if(request.getParameter("nombre")!=null) {
					nombre=request.getParameter("nombre");
				}
				
				int FK_dificultad=0;
				if(request.getParameter("FK_dificultad")!=null) {
					FK_dificultad = Integer.parseInt(request.getParameter("FK_dificultad"));
				}
				
				Recetas receta= new Recetas (0,nombre,FK_dificultad);
				
				//3
				DB_Helper db= new DB_Helper();
				Connection con= db.conectar();
				
				//4
				db.insertareceta(con, receta);
				
				//5
				db.desconectar(con);
				
				request.setAttribute("lista", con);
				
				request.getRequestDispatcher(JSP_INSERTAR).forward(request, response);
				
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

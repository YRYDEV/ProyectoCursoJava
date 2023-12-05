
package com.ipartek;

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
import com.ipartek.modelo.dto.V_Recetas;

/**
 * Servlet implementation class Cargar
 */
@WebServlet("/Cargar")
public class Cargar extends HttpServlet implements DAO_Constantes{
	private static final long serialVersionUID = 1L;
       
   
    public Cargar() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3
		DB_Helper db= new DB_Helper();
		Connection con= db.conectar();
		
		//4

		
		//5
		db.desconectar(con);
		//6
		
		//7
		request.getRequestDispatcher(JSP_INICIO).forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

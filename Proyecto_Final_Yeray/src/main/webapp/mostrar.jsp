<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.ipartek.modelo.dto.V_Recetas"%>
<%@ page import="com.ipartek.modelo.DAO_Constantes"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.ipartek.menu.CargarReceta"%>
<%@ page import="com.ipartek.modelo.dto.Dificultades"%>


<%
    List<V_Recetas> receta = new ArrayList<V_Recetas>();
    if(request.getAttribute(DAO_Constantes.ATR_LISTA_RECETAS) != null){
        receta = (List<V_Recetas>)request.getAttribute(DAO_Constantes.ATR_LISTA_RECETAS);
      }
    
    
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="styles/mostrar.css">
    
    <title>Insert title here</title>
</head>
<body>
    <%@ include file="includes/cabecera.jsp"%>

	<main>
			
			
            	<form action="Cargar" method="post">
            	<input type = "submit" name= "Volver" value="Volver">
            	
        	</form>

		<% for(V_Recetas elemento : receta) { %>
		<table>
			<tr>
				<td>
					<!-- <h1><%= elemento.getId() %></h1> El ID no hace falta visualizarlo-->
					<h2><%= elemento.getNombre() %></h2> <!-- <h3><%= elemento.getFK_dificultad() %></h3>El ID dificultad no hace falta visualizarlo-->
					<h4><%= elemento.getDificultad() %></h4>
				</td>
			</tr>
		</table>
		<% } %>

	</main>
</body>
</html>

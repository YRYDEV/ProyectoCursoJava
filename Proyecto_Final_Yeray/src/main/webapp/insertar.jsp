<%@page import="com.ipartek.modelo.dto.Dificultades"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.DAO_Constantes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.ipartek.modelo.dto.V_Recetas" %>
  
    
  <!-- Esto recoge el valor de una constante llamandola por el request, soliticando su clave y se le devuelve su valor -->  
 <%
 List<Dificultades> listaDificultades = new ArrayList<Dificultades>();
 if(request.getAttribute(DAO_Constantes.ATR_DIFICULTAD_RECETAS)!=null){
	 listaDificultades=	(List<Dificultades>)request.getAttribute(DAO_Constantes.ATR_DIFICULTAD_RECETAS);
 }
 %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles/insertar.css">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="includes/cabecera.jsp"%>
<main>
        <!-- Formulario para insertar datos -->
        <form action="Insertar" method="get">
            <label for="insertar">Inserta el nombre de tu receta:</label>
            <input type="text" id="nombre" name="nombre" required>

            <label for="dificultad">¿Cual es su dificultad?</label>
            <select id="dificultad" name="FK_dificultad" >
				<%
				for (Dificultades elemento : listaDificultades) {
				%>

				<option value="<%= elemento.getId()%>"><%= elemento.getDificultad()%></option>
                
				

				<%
				}
				%>
			</select>
           	<input type = "submit" name= "Enviar" value="Enviar">
		</form>
			
            	<form action="Cargar" method="post">
            	<input type = "submit" name= "Volver" value="Volver">
            	
        	</form>
    </main>


</body>
</html>
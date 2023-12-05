<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	 <%@page import="com.ipartek.modelo.dto.V_Recetas"%>
<%@page import="com.ipartek.modelo.DAO_Constantes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.dto.Dificultades"%>
<%@page import="java.util.List"%> 
<%@page import="com.ipartek.menu.CargarReceta"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles/styles.css">

<title>Insert title here</title>
<title>Título de tu página</title>
<!-- Puedes agregar enlaces a hojas de estilo CSS aquí -->
<!-- <link rel="stylesheet" href="estilos.css"> -->
</head>
<body>

	<!-- Encabezado -->
	<%@ include file="includes/cabecera.jsp"%>

	<!-- Contenido principal -->
	<main>
		<section>
			<h2>El Sabor</h2>
			<p>Descubre un festín de sabores en nuestra web de recetas
				culinarias. Desde platos clásicos hasta innovadoras creaciones,
				explorarás una variedad de opciones para satisfacer tu paladar.
				Navega fácilmente por nuestras categorías, encuentra inspiración y
				sigue paso a paso las recetas detalladas. ¡Embárcate en un viaje
				gastronómico con nosotros y convierte cada comida en una experiencia
				inolvidable! Visita nuestro sitio ahora y descubre el arte de
				cocinar de manera sencilla y deliciosa.</p>
				<img src="imagenes/cocinaprofesional.jpg" alt="Cocina profesional"
				class="imagen-1"> 
				
		</section>

		<section>
			<h2>Elige una opcion</h2>

			<nav>
				<ul id="opciones">
					<li class="opcionesmenu1"><a href="Insertarreceta">Insertar</a>
					</li>
					<li class="opcionesmenu2"><a href="CargarReceta">Mostrar</a></li>


				</ul>
			</nav>
		</section>
	</main>

<%@ include file="includes/piepagina.jsp"%>

	

</body>
</html>
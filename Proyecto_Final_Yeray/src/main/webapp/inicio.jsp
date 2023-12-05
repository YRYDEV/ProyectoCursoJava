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
<title>T�tulo de tu p�gina</title>
<!-- Puedes agregar enlaces a hojas de estilo CSS aqu� -->
<!-- <link rel="stylesheet" href="estilos.css"> -->
</head>
<body>

	<!-- Encabezado -->
	<%@ include file="includes/cabecera.jsp"%>

	<!-- Contenido principal -->
	<main>
		<section>
			<h2>El Sabor</h2>
			<p>Descubre un fest�n de sabores en nuestra web de recetas
				culinarias. Desde platos cl�sicos hasta innovadoras creaciones,
				explorar�s una variedad de opciones para satisfacer tu paladar.
				Navega f�cilmente por nuestras categor�as, encuentra inspiraci�n y
				sigue paso a paso las recetas detalladas. �Emb�rcate en un viaje
				gastron�mico con nosotros y convierte cada comida en una experiencia
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
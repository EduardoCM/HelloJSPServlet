<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Registro de Ciudadano</h1>

	<form action="ciudadano" method="post">
		<table>
			<tr>
				<td>Nombre: </td>
				<td><input type="text" name="nombre"></td>
			</tr>
			
			<tr>
				<td>Apellidos: </td>
				<td><input type="text" name="apellidos"></td>
			</tr>
			
			<tr>
				<td>Edad: </td>
				<td><input type="text" name="edad"></td>
			</tr>
			
			<tr>
				<td>Sexo: </td>
				<td><input type="text" name="sexo"></td>
			</tr>
			
			<tr>
				<td>Delegacion: </td>
				<td><input type="text" name="delegacion"></td>
			</tr>
		</table>
	<button type="submit">Registrar Ciudadano</button>
	</form>
	
	<a href="ciudadano">Consultar Ciudadanos</a>


</body>
</html>
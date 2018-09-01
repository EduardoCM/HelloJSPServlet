<%@page import="java.time.Period"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Hello World JSP</h1>
  <% 
      String nombre = "Eduardo Castillo Mendoza";
  LocalDate nacimiento = LocalDate.of(1990, 9, 10);
  LocalDate diaHoy = LocalDate.now();
  Period edad = Period.between(nacimiento, diaHoy);
  
  out.print("Mi nombre es: " + nombre + 
		  " Tengo " + edad.getYears() + " Años " +
		  edad.getMonths() + " Meses " +
		  edad.getDays() + " Dias de vida");
  %>

</body>
</html>








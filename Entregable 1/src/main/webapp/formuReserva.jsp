<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H4>Seleccione:</H4>
 	<FORM action="ServletChequearReserva" method="POST">
 	<select name="actividades" size=5>
 	
 	<%  String actividades1 = (String) getServletContext().getInitParameter("actividades1");
 	String actividades2 = (String) getServletContext().getInitParameter("actividades2");
 	String actividades3 = (String) getServletContext().getInitParameter("actividades3");
 	String actividades4 = (String) getServletContext().getInitParameter("actividades4");
 	String actividades5 = (String) getServletContext().getInitParameter("actividades5");
 	
 	Integer cupo1=(Integer)getServletContext().getAttribute("GAP");
 	Integer cupo2=(Integer)getServletContext().getAttribute("BodyPump");
 	Integer cupo3=(Integer)getServletContext().getAttribute("Streatching");
 	Integer cupo4=(Integer)getServletContext().getAttribute("Musculación");
 	Integer cupo5=(Integer)getServletContext().getAttribute("CrossFit");
 	
 	
 	

 	
 	%>
 	
 	
 	
 
 	<option value="<%=actividades1%>">Cupo disponible: <%=cupo1%>, <%=actividades1%> </option>
 	<option value="<%=actividades2%>">Cupo disponible: <%=cupo2%>, <%=actividades2%></option>
 	<option value="<%=actividades3%>">Cupo disponible: <%=cupo3%>, <%=actividades3%> </option>
 	<option value="<%=actividades4%>">Cupo disponible: <%=cupo4%>, <%=actividades4%> </option>
 	<option value="<%=actividades5%>">Cupo disponible: <%=cupo5%>, <%=actividades5%> </option>
 	</select>
 	<input type="submit" value="Seleccionar">
 	</FORM>
 	<input type="text" name= "reiniciar">
 	<input type="submit" value="Reiniciar contador">
</body>
</html>
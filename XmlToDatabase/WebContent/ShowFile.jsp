<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
	<tr>
	<th>id</th>
	<th>Name</th>
	<th>Model</th>
	<th>Description</th>
	<th>Nof</th>
	<th>Pono</th>
	<th>Specification-Book</th>
	<th>Production-year</th>
	<th>Production-Date</th>
	
	</tr>
	<tr>
<%
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracledb","12345");
	PreparedStatement ps=con.prepareStatement("select * from vehicle_information");
	ResultSet rs=ps.executeQuery();
	while(rs.next()){%>
		<td><%=rs.getString(1)%></td>
		<td><%=rs.getString(2)%></td>
		<td><%=rs.getString(3)%></td>
		<td><%=rs.getString(4)%></td>
		<td><%=rs.getString(5)%></td>
		<td><%=rs.getString(6)%></td>
		<td><%=rs.getString(7)%></td>
		<td><%=rs.getString(8)%></td>
		<td><%=rs.getString(9)%></td>
	</tr>
	<%}%> 
	</table>
	<%}catch(Exception e){}%>
	<br>
<form action="Login.jsp">
		<button>Back</button>
	</form>


</body>
</html>
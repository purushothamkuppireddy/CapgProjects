<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (request.getParameter("name").equals("capg") && request.getParameter("password").equals("12345")) {
	%>
	<form action="upload.jsp">
	<input type="file" name="myFile"/>
		<button>upload file</button>
	</form>
	<br>
	<form action="ShowFile.jsp">
		<button>ShowFile</button>
	</form>

	<%
		} else {
		%>
	<h2>invalid credential</h2>
	<form action="Login.jsp">
		<button>Back</button>
	</form>
	
	<%
		}
	%>
</body>
</html>
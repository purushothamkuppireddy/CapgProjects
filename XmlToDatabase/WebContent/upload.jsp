
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.w3c.dom.Element"%>
<%@page import="org.w3c.dom.Node"%>
<%@page import="org.w3c.dom.NodeList"%>
<%@page import="org.w3c.dom.Document"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
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
String path=request.getParameter("myFile");
DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
DocumentBuilder builder= factory.newDocumentBuilder();
Document doc= builder.parse(path);
NodeList list=doc.getElementsByTagName("vehicle-information");
int j=0;
for(int i=0;i<list.getLength();i++){
Node n=list.item(i);
Element e=(Element)n;

try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracledb","12345");
	PreparedStatement ps=con.prepareStatement("insert into vehicle_information values(?,?,?,?,?,?,?,?,?)");
	ps.setString(1, e.getElementsByTagName("id").item(0).getTextContent());
	ps.setString(2, e.getElementsByTagName("name").item(0).getTextContent());
	ps.setString(3, e.getElementsByTagName("model").item(0).getTextContent());
	ps.setString(4, e.getElementsByTagName("description").item(0).getTextContent());
	ps.setString(5, e.getElementsByTagName("nof").item(0).getTextContent());
	ps.setString(6, e.getElementsByTagName("pono").item(0).getTextContent());
	ps.setString(7, e.getElementsByTagName("specification-book").item(0).getTextContent());
	ps.setString(8, e.getElementsByTagName("production-year").item(0).getTextContent());
	ps.setString(9, e.getElementsByTagName("production-date").item(0).getTextContent());
	
	j=ps.executeUpdate();
	
} catch (ClassNotFoundException e2) {
	e2.printStackTrace();
} catch (SQLException e3) {
	e3.printStackTrace();
}
}
if(j!=0){
	out.print("inserted successfully");
	
}
else
	out.print("already existed or failed to insert");

%>
<form action="Login.jsp">
		<button>Back</button>
	</form>
</body>
</html>
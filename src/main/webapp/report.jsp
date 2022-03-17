<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<body>
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
response.setHeader("Progma","no-cache");
response.setHeader("Expires","0");
if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}
%>
<h1>Result</h1>
<table>
<tr><td>Employee ID Number</td><td><%= session.getAttribute("Employee_ID_Number_111915077") %></td></tr>
<tr><td>First Name</td><td><%= session.getAttribute("First_Name_111915077") %></td></tr>
<tr><td>Last Name</td><td><%= session.getAttribute("Last_Name_111915077") %></td></tr>
<tr><td>Date of Birth</td><td><%= session.getAttribute("Date_of_Birth_111915077") %></td></tr>
<tr><td>Contact Number</td><td><%= session.getAttribute("Contact_Number_111915077") %></td></tr>
<tr><td>Job Role</td><td><%= session.getAttribute("Job_Role_111915077") %></td></tr>
<tr><td>Monthly Salary</td><td><%= session.getAttribute("Monthly_Salary_111915077") %></td></tr>
<tr><td>Yearly Bonus</td><td><%= session.getAttribute("Yearly_Bonus_111915077") %></td></tr>
<tr><td>Total Salary</td><td><%= Integer.parseInt(session.getAttribute("Yearly_Bonus_111915077").toString())+(Integer.parseInt(session.getAttribute("Monthly_Salary_111915077").toString())*12)%></td></tr>
</table>
</body>
</html>
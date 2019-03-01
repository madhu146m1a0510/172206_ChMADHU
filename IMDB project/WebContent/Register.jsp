<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Registration</h1>
<form action="Registerservlet" method="post">
			<table style="with: 50%">
				
				
				<tr>
					<td>FirstName</td>
					<td><input type="text" name="firstname" /></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><input type="text" name="lastname" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				
				<tr>
					<td>mobile num</td>
					<td><input type="text" name="mobilenum" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>
			</center>
</body>
</body>
</html>
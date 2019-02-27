package com.cg.imdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	static boolean status=false;
	public static boolean validate(String username,String password){  
		  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from register where username=? and password=? ");  
		ps.setString(1,username);  
	ps.setString(2, password);
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);} 
		System.out.println(username);
		return status;  
		}  
		}  

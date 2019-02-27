package com.cg.imdb;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class RegisterDAO {

	public boolean register(String firstname, String lastname, String username, String password, String email, String mobilenum,
			String address)  throws SQLException 
	{
		    Connection con =ConnectionFactory.getConnection();
		    System.out.println(con);
		    String sql =   "insert into register values (?,?,?,?,?,?,?)";
			  PreparedStatement pst =   con.prepareStatement(sql);
			  pst.setString(1, firstname); 
			  pst.setString(2, lastname);
			  pst.setString(3, username);
			  pst.setString(4, password);
			  pst.setString(5, email);
			  pst.setString(6, mobilenum);
			  pst.setString(7, address);
			  pst.executeUpdate();
			
		return true;
	}
}
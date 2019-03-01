package com.cg.imdb;

	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	import java.sql.Connection;

	public class CommentsDAO
	{

		
		public void  insertComments(CommentPojo comm) throws SQLException
		{
			String query="insert into comments values(?)";
			Connection conn =ConnectionFactory.getConnection();
			PreparedStatement pStatement= conn.prepareStatement(query);
			pStatement.setString(1, comm.getComments());
		     pStatement.executeUpdate();
			
		}	
		
		

		
		/*public static void main(String args[]) throws SQLException
		{
			CommentsDAO o=new CommentsDAO();
			o.insert(new CommentPojo("madhu"));
		}*/
	}



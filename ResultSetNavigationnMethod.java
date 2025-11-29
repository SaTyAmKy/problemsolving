package PracticeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetNavigationnMethod {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/company_db";
		String username = "root";
		String password = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
		
			Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = st.executeQuery("Select * from  login");
			
			System.out.println("All elements :");
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"    "+rs.getString(2));
			}
			System.out.println(); 
			System.out.println("First element:");
			rs.first();
			System.out.println(rs.getInt(1)+"    "+rs.getString(2));
			
			System.out.println();
			System.out.println("last element");
			rs.last();
			System.out.println(rs.getInt(1)+"    "+rs.getString(2));
			
			System.out.println();
			System.out.println("Previous element :");
			rs.previous();
			System.out.println(rs.getInt(1)+"    "+rs.getString(2));
			
			rs.absolute(5);
			
			rs.updateString(2,"Horse");
			rs.updateRow();
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"    "+rs.getString(2));
				
			}
			System.out.println("EXECUTED");
			
			rs.close();
			st.close();
			connection.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}

package PracticeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTheRecordUsingPreparedStatement {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/company_db";
		String username = "root";
		String password = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter id :");
			int n = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter username :");
			String name = sc.nextLine();
			
			PreparedStatement ps = connection.prepareStatement("Update login set username = ? where id = ?");
			ps.setString(1,name);
			ps.setInt(2, n);
			
			
			ps.executeUpdate();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

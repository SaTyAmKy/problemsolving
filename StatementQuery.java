package PracticeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementQuery {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/company_db";
		String username = "root";
		String password = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM LOGIN");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"   "+rs.getString(2));
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
		}
		
		
	}

}

package PracticeJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class CallStoredProcedureJdbc {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/company_db";
		String username = "root";
		String password = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			CallableStatement cs = connection.prepareCall("call getName(?,?,?)");
			cs.setInt(1, 1);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.execute();
			
			System.out.println(cs.getString(2));
			System.out.println(cs.getString(3));
			
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
	}

	}
}

package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class daoUtil {
	
	public static final String USER_NAME = "admin123";
	public static final String PASSWORD = "Password123";
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String URI = "mysqlserver-gruns.database.windows.net\r\n";
	
	public static Connection getConnection() {
		
		Connection connection= null;
		
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URI, USER_NAME , PASSWORD);
			return connection;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}
	
	public static void closeConnection (Connection connection) {
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

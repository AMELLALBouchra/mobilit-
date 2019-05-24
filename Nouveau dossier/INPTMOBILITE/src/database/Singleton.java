package database;
import java.sql.*;
public class Singleton {
	private static Connection connection;
	static {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilite?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","");
				
			}
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static Connection getconnection() {
		return connection;
	}

	}




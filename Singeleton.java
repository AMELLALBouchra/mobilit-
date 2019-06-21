package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;

public class Singeleton {
	
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



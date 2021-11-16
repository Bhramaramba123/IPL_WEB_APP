package in.co.ipl.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCAccessImp implements JDBCAccess 
{
final String URL = "jdbc:mysql://localhost:3306/ipldb";
final String USER = "root";
final String PWD = "Rojapooja@1";
Connection connection = null;

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, PWD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
		return connection;
	}

	@Override
	public void createDBSchema() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroyDBSchema() {
		// TODO Auto-generated method stub
		
	}

}

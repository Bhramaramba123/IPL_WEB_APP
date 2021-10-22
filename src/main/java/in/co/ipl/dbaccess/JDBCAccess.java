package in.co.ipl.dbaccess;

import java.sql.Connection;

public interface JDBCAccess extends DataBaseAccess
{
public Connection getConnection();
public void createDBSchema();
public void destroyDBSchema();

	
}

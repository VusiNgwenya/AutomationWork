package testcases;

import java.sql.Connection;
import java.sql.DriverManager;

import Utillities.TestConfig;

public class DBManager
{

	private static Connection con=null;
	private static Connection conn = null;
	
	public static void setDbConnection()
	{
		try {
			Class.forName(TestConfig.mysqldriver);
			conn = DriverManager.getConnection(TestConfig.mysqlurl);
			
			if(!conn.isClosed())
				System.out.println("Succeeefully connected to MySQL");
		}
		catch(Exception e)
		{
			System.err.println("Cannot connect to database server");
		}
	}
	
	public static void setMysqlDbConnection()
	{
		try
		{
			Class.forName(TestConfig.mysqldriver);
		    conn = DriverManager.getConnection(TestConfig.mysqlurl,TestConfig.mysqlusername,TestConfig.mysqlpassword);
		    
		    if(!conn.isClosed())
		    	System.out.println("Successfully connected to MySQL Server");
		    
			
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.err.println("Cannot connect to database server");
		}
	}
	
}

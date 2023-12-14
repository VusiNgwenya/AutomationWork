package testcases;

import java.sql.SQLException;

public class TestDBConn {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DbManager.setMysqlDbConnection();
		
		System.out.println(DbManager.getMysqlQuery("select tutorial_author from"));
		
	}

}

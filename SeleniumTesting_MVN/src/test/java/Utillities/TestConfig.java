package Utillities;

import org.openqa.selenium.WebDriver;

public class TestConfig 
{
	
	public static String server = "smtp.gmail.com";
	public static String from = "corporate@way2automation.com";
	public static String password = "Selenium@123";
	public static String[] to = {"seleniumcoaching@gmail.com","tr"};
	public static String subject = "Test Report";
	
	public static String messageBody = "TestMessage";
	public static String attachmentPath = "/Users/abvn237/eclipse-workspace/SeleniumTesting5/first.png";
	public static String attachmentName = "error.png";
	
	public static String driver = "net.sourceforge.jtds.jdbc.Driver";
	public static String dbConnectionUrl = "jdbc:jtds:sqlserver://";
	public static String dbUsername = "sa";
	public static String dbPassword = "$q1$!!1";
	
	
	public static String mysqldriver = "com.mysql.jdbc.Driver";
	public static String mysqlusername = "root";
	public static String mysqlpassword = "selenium";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/root";
	
	

}
